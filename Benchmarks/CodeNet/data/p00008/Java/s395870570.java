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
			int		nNum = Integer.parseInt(str);
			int[]	aNum = new int[4];

			for(; aNum[0] < 10; aNum[0]++) {
				if (aNum[0] > nNum) {
					break;
				}
				for(aNum[1] = aNum[0]; aNum[1] < 10; aNum[1]++) {
					if (aNum[0] + aNum[1] > nNum) {
						break;
					}
					for(aNum[2] = aNum[1]; aNum[2] < 10; aNum[2]++) {
						if (aNum[0] + aNum[1] + aNum[2] > nNum) {
							break;
						}
						for(aNum[3] = aNum[2]; aNum[3] < 10; aNum[3]++) {
							if (aNum[0] + aNum[1] + aNum[2] + aNum[3] == nNum) {
								nCnt += getCnt(aNum);
							}
							else if (aNum[0] + aNum[1] + aNum[2] + aNum[3] > nNum) {
								break;
							}
						}
					}
				}
			}
		}
		catch (NumberFormatException e) {}

		return nCnt;
	}

	private static int getCnt(int[] aNum) {
		int	nCnt = 0;
		int	nN   = aNum.length;
		int	nM   = 1;

		Arrays.sort(aNum);
		for(int nLoop = nN - 1; nLoop > 0; nLoop--) {
			nM += (aNum[nLoop] != aNum[nLoop-1]) ? 0 : 1;
		}
		nCnt = fact(nN) / (fact(nM) * fact(nN - nM));

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