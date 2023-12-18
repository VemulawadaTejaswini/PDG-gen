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
		double[][]	aVector = null;

		while((aVector = parseVector()) != null) {
			result(aVector);
		}
	}

	private static double[][] parseVector() {
		double[][]	aVector = null;
		String[]	as      = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					aVector        = new double[2][2];	
					as             = line.split(" ");
					aVector[0][0]  = Double.parseDouble(as[2]) - Double.parseDouble(as[0]);
					aVector[0][1]  = Double.parseDouble(as[3]) - Double.parseDouble(as[1]);
					aVector[1][0]  = Double.parseDouble(as[6]) - Double.parseDouble(as[4]);
					aVector[1][1]  = Double.parseDouble(as[7]) - Double.parseDouble(as[5]);
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return aVector;
	}

	private static void result(double[][] aVector) {
		if (aVector[0][0] * aVector[1][0] + aVector[0][1] * aVector[1][1] == 0.0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}