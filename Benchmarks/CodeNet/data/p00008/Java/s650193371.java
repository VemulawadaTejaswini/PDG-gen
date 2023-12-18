import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
		String line = null;

		while((line = parseNum()) != null) {
			int nCnt = calc(line);
			System.out.println(nCnt);
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

	private static int calc(String str) {
		int	nCnt = 0;
		try {
			int	nNum = Integer.parseInt(str);

			if (nNum <= 36) {
				for(int n1 = 0; n1 < 10; n1++) {
					if (n1 > nNum) {
						break;
					}
					for(int n2 = n1; n2 < 10; n2++) {
						if (n1 + n2 > nNum) {
							break;
						}
						for(int n3 = n2; n3 < 10; n3++) {
							if (n1 + n2 + n3 > nNum) {
								break;
							}
							for(int n4 = n3; n4 < 10; n4++) {
								if (n1 + n2 + n3 + n4 == nNum) {
									nCnt += getCnt(n1, n2, n3, n4);
								}
								else if (n1 + n2 + n3 + n4 > nNum) {
									break;
								}
							}
						}
					}
				}
			}
		}
		catch (NumberFormatException e) {}

		return nCnt;
	}

	private static int getCnt(int n1, int n2, int n3, int n4) {
		int		nCnt = 0;
		int[]	aNum = new int[4];
		int[]	aCnt = new int[4];

		aNum[0] = n1;
		aNum[1] = n2;
		aNum[2] = n3;
		aNum[3] = n4;
		Arrays.sort(aNum);

		aCnt[0] = 1;
		
		for(int nLoop = 0, nTmp = 0; nLoop < aNum.length - 1; nLoop++) {
			nTmp += (aNum[nLoop] == aNum[nLoop+1]) ? 0 : 1;
			aCnt[nTmp]++;
		}
		nCnt = fact(aNum.length) / (fact(aCnt[0]) * fact(aCnt[1]) * fact(aCnt[2]) * fact(aCnt[3]));

		return nCnt;
	}

	private static int fact(int x) {
		int nFact = 1;

		for (int nLoop = 1; nLoop <= x; nLoop++) {
			nFact = nFact * nLoop;
		}

		return nFact;
	}
}