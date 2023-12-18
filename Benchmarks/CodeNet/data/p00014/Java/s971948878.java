import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br   = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strPrime = null;
		int		nPrime   = 0;
		int		nMax     = 0;

		while ((strPrime = parseNum()) != null) {
			int	nSum = 0;

			nPrime = Integer.parseInt(strPrime);
			nMax   = 600 / nPrime - 1;
			nSum   = (nPrime * nPrime * nPrime * nMax * (nMax + 1) * (2 * nMax + 1)) / 6;

			System.out.println(nSum);
		}
	}

	private static String parseNum() {
		String	strNum = null;

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