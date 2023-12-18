import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]	aRect = null;

		while((aRect = parseRect()) != null) {
			result(aRect);
		}
	}

	private static double[][] parseRect() {
		double[][]	aRect = null;
		String[]	as    = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					aRect       = new double[2][4];	
					as          = line.split(" ");
					aRect[0][0] = Double.parseDouble(as[0]);
					aRect[0][1] = Double.parseDouble(as[1]);
					aRect[0][2] = Double.parseDouble(as[2]) - Double.parseDouble(as[0]);
					aRect[0][3] = Double.parseDouble(as[3]) - Double.parseDouble(as[1]);
					aRect[1][0] = Double.parseDouble(as[4]);
					aRect[1][1] = Double.parseDouble(as[5]);
					aRect[1][2] = Double.parseDouble(as[6]) - Double.parseDouble(as[4]);
					aRect[1][3] = Double.parseDouble(as[7]) - Double.parseDouble(as[5]);
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return aRect;
	}

	private static void result(double[][] aRect) {
		Rectangle2D.Double rect = new Rectangle2D.Double();

		rect.setRect(aRect[0][0], aRect[0][1], aRect[0][2], aRect[0][3]);
		if (rect.intersects(aRect[1][0], aRect[1][1], aRect[1][2], aRect[1][3])) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}