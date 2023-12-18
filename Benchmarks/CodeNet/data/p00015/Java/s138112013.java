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
		int	nMax = parseMax();

		for (int nCnt = 0; nCnt < nMax; nCnt++) {
			calc();
		}
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

	private static int parseMax() {
		String	strMax = parseStdin();
		return (strMax == null) ? 0 : Integer.parseInt(strMax);
	}

	private static long[] parseNum(String strNum) {
		long[]	alNum  = new long[5];
		String	strTmp = null;
		int		nDiv   = strNum.length() / 16;
		int		nMod   = strNum.length() % 16;
		int		nArrI  = 5 - nDiv;
		int		nStrI  = 0;

		if (nMod != 0) {
			strTmp = strNum.substring(0, nMod);
			alNum[nArrI - 1] = Long.parseLong(strTmp);
			nStrI += nMod;
		}

		for (;nArrI < 5; nStrI += 16, nArrI++) {
			strTmp = strNum.substring(nStrI, nStrI + 16);
			alNum[nArrI] = Long.parseLong(strTmp);
		}

		return alNum;
	}

	private static void calc() {
		String	strNum1 = parseStdin();
		String	strNum2 = parseStdin();

		if (strNum1.length() > 80 || strNum2.length() > 80) {
			System.out.println("overflow");
		}
		else {
			long[]	alNum1 = parseNum(strNum1);
			long[]	alNum2 = parseNum(strNum2);

			for(int nArrI = 4; nArrI >= 0; nArrI--) {
				alNum1[nArrI] += alNum2[nArrI];
				if (nArrI > 0 && alNum1[nArrI] >= (long)1e+16) {
					alNum1[nArrI]     %= (long)1e+16;
					alNum1[nArrI - 1] += (long)1;
				}
			}

			if (alNum1[0] >= (long)1e+16) {
				System.out.println("overflow");
			}
			else {
				boolean	bZero = true;

				for(int nArrI = 0; nArrI < 5; nArrI++) {
					if (bZero) {
						if (alNum1[nArrI] > 0L && bZero) {
							System.out.printf("%d", alNum1[nArrI]);
							bZero = false;
						}
					} else {
						System.out.printf("%016d", alNum1[nArrI]);
					}
				}

				if (bZero) {
					System.out.println("0");
				}
				else {
					System.out.println("");
				}
			}
		}
	}
}