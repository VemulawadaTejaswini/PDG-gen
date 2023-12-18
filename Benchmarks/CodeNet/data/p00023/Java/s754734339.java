import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	nMax = getNum();

		for (int n = 0; n < nMax; n++) {
			double[]	aCir = getCircle();
			double		dDst = Math.sqrt((aCir[0] - aCir[3]) * (aCir[0] - aCir[3]) + (aCir[1] - aCir[4]) * (aCir[1] - aCir[4]));

			if (dDst > aCir[2] + aCir[5]) {
				System.out.println(0);
			}
			else if (dDst <= (aCir[2] - aCir[5])&& aCir[2] > aCir[5]) {
				System.out.println(2);
			}
			else if (dDst <= (aCir[5] - aCir[2])&& aCir[5] > aCir[2]) {
				System.out.println(-2);
			}
			else {
				System.out.println(1);
			}
		}
	}

	private static int getNum() {
		return Integer.parseInt(parseStdin());
	}

	private static double[] getCircle() {
		String[]	aPrm = parseStdin().split(" ");
		double[]	aCir = {
			Double.parseDouble(aPrm[0]),
			Double.parseDouble(aPrm[1]),
			Double.parseDouble(aPrm[2]),
			Double.parseDouble(aPrm[3]),
			Double.parseDouble(aPrm[4]),
			Double.parseDouble(aPrm[5])
		};

		return aCir;
	}

	private static String parseStdin() {
		String	strNum = "";

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}