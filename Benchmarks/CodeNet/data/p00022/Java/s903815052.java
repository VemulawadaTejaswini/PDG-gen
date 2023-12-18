import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	nNum = 0;
		int	nTmp = 0;
		int	nSum = 0;
		int	nMax = 0;

		while((nNum = getNum()) != 0) {
			nSum = getNum();
			nMax = nSum;
			for (int n = 1; n < nNum; n++) {
				nTmp = getNum();
				nSum = Math.max(nSum + nTmp, nTmp);
				nMax = Math.max(nSum, nMax);
			}
			System.out.println(nMax);
		}
	}

	private static int getNum() {
		return Integer.parseInt(parseStdin());
	}

	private static String parseStdin() {
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