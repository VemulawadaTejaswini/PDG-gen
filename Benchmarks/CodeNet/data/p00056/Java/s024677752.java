import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	private	static	BufferedReader		br      = null;
	private	static	ArrayList<Integer>	prime   = null;
	private	static	ArrayList<Integer>	borders = null;

	static {
		br      = new BufferedReader(new InputStreamReader(System.in));
		prime   = new ArrayList<Integer>();
		borders = new ArrayList<Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	nLen;
		parseBorder();
		createPrimeList();

		nLen = borders.size();
		for (int a = 0; a < nLen; a++) {
			System.out.println(result(borders.get(a)));
		}
	}

	private static int result(int num) {
		int	cnt = 0;
		int pr1 = 0;
		int pr2 = 0;
		int len = prime.size();

		if (num % 2 == 0) {
			for (int a = 0; a < len; a++) {
				pr1 = prime.get(a);
				if (pr1 >= num) {
					break;
				}
				for (int b = a; b < len; b++) {
					pr2 = prime.get(b);
					if (pr1 + pr2 == num) {
						cnt++;
						break;
					}
					else if (pr1 + pr2 > num) {
						break;
					}
				}
			}
		}

		return cnt;
	}

	private static void parseBorder() {
		int	nNum = 0;
		while((nNum = parseNum()) != 0) {
			borders.add(nNum);
		}
	}

	private static int parseNum() {
		int		num    = 0;
		String	strNum = parseStdin();

		if (strNum != null) {
			num = Integer.parseInt(strNum);
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

	private static void createPrimeList() {
		boolean		bPrime = true;
		int			nPrime = 0;
		Object[]	aWork  = borders.toArray();

		Arrays.sort(aWork);
		prime.add(2);
		for(int nNum = 3; nNum <= (Integer)aWork[aWork.length - 1]; nNum += 2) {
			bPrime = true;

			for (int nLoop = 0; nLoop < prime.size(); nLoop++) {
				nPrime = prime.get(nLoop);
				if (nPrime <= (int)Math.sqrt((double)nNum)) {
					if (nNum % nPrime == 0) {
						bPrime = false;
						break;
					}
				}
				else {
					break;
				}
			}

			if (bPrime) {
				prime.add(nNum);
			}
		}
	}
}