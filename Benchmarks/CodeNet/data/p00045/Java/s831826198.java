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
		int[]	sum   = new int[2];
		int[]	table = null;
		int		nCnt  = 0;

		while ((table = parseHanbai()) != null) {
			sum[0] += table[0] * table[1];
			sum[1] += table[1];
			nCnt++;
		}

		if (nCnt > 0) {
			System.out.println(sum[0]);
			System.out.println((int)Math.round((double)sum[1] / (double)nCnt));
		}
	}

	private static int[] parseHanbai() {
		String	strIn = null;
		int[]	table = null;

		if ((strIn = parseStdin()) != null) {
			String[]	line = strIn.split(",");

			table    = new int[2];
			table[0] = Integer.parseInt(line[0]);
			table[1] = Integer.parseInt(line[1]);
		}
		
		return table;
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