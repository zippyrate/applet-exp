package exp.applet;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MyApplet extends JApplet
{
	private static final long serialVersionUID = 2725554039786521142L;

	// Called when this applet is loaded into the browser.
	@Override
	public void init()
	{
		// Execute a job on the event-dispatching thread; creating this applet's GUI.
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run()
				{
					createGUI();
				}
			});
		} catch (Exception e) {
			System.err.println("createGUI didn't complete successfully");
		}
	}

	private void createGUI()
	{
		JLabel lbl = new JLabel("Hi");
		setContentPane(lbl);
	}

	@Override
	public void start()
	{
	}

	@Override
	public void stop()
	{
	}

	@Override
	public void destroy()
	{
	}
}
