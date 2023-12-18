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
		int[]	num = null;

		while((num = parseNum()) != null) {
			System.out.println(calc(0, 1, num[0], 0, num[1]));
		}
	}

	private static int calc(int nBit, int trmc, int trmm, int sumc, int summ) {
		int	nCnt = 0;

		for (int n = 0; n <= 9; n++) {
			if ((nBit & (1 << n)) != 0) {
				continue;
			}

			if (trmc == trmm && (sumc + n * trmc == summ)) {
				// 最終項までの総和が指定した総和と一致した
				nCnt += 1;
			}
			else if (trmc != trmm) {
				// 最終項より前までの総和が指定した総和より小さい
				nBit |= 1 << n;
				nCnt += calc(nBit, trmc + 1, trmm, sumc + n * trmc, summ);
				nBit &= ~(1 << n);
			}
		}

		return nCnt;
	}

	private static int[] parseNum() {
		int[]	num   = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	split = strIn.split(" ");
			num    = new int[2];
			num[0] = Integer.parseInt(split[0]); 
			num[1] = Integer.parseInt(split[1]); 
		}
		
		return num;
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