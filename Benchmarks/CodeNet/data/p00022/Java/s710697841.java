import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	ArrayList<Integer>	list = null;
	private	static	BufferedReader		br   = null;

	static {
		list = new ArrayList<Integer>();
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
			// 連続する正の数と負の数の和を求める
			for (int n = 0; n < nNum; n++) {
				nTmp = getNum();
				if (nTmp >= 0) {
					nSum = (n == 0) ? nTmp : nSum + nTmp;
					if (n == nNum - 1) {
						list.add(nSum);
					}
				}
				else {
					if (nSum > 0) {
						list.add(nSum);
					}
					nSum = nTmp;
					list.add(nSum);
					nSum = 0;
				}
			}

			// 和の最大値を求める
			nSum = list.get(0);
			nMax = nSum;
			for (int n = 1; n < list.size(); n++) {
				if (nSum < 0) {
					nSum = 0;
				}
				nSum += list.get(n);
				nMax  = Math.max(nMax, nSum);
			}
			System.out.println(nMax);
			list.clear();
		}
	}

	private static int getSign(int nNum) {
		return (nNum >= 0) ? 1 : 0;
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