import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader		br    = null;
	private	static	ArrayList<Integer>	listA = null;
	private	static	ArrayList<Integer>	listB = null;

	static {
		br    = new BufferedReader(new InputStreamReader(System.in));
		listA = new ArrayList<Integer>();
		listB = new ArrayList<Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (paramNum() != -1) {
			int	nH = 0;
			int	nB = 0;
			for (int n = 0; n < 4; n++) {
				int i = listA.indexOf(listB.get(n));
				if (i != -1) {
					if (i == n) {
						nH++;
					}
					else {
						nB++;
					}
				}
			}
			System.out.printf("%d %d\n", nH, nB);
		}
	}

	private static int paramNum() {
		int		nRet  = 0;
		String	strIn = null;

		for (int n = 0; n < 2; n++) {
			if ((strIn = parseStdin()) == null) {
				nRet = -1;
				break;
			}

			String[]	aN = strIn.split(" ");
			if (n == 0) {
				listA.clear();
				listA.add(Integer.parseInt(aN[0]));
				listA.add(Integer.parseInt(aN[1]));
				listA.add(Integer.parseInt(aN[2]));
				listA.add(Integer.parseInt(aN[3]));
			} else {
				listB.clear();
				listB.add(Integer.parseInt(aN[0]));
				listB.add(Integer.parseInt(aN[1]));
				listB.add(Integer.parseInt(aN[2]));
				listB.add(Integer.parseInt(aN[3]));
			}
		}
		
		return nRet;
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