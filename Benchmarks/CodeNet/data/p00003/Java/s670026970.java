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
		int		nItems = 0;
		int[]	aLens  = null;

		nItems = parseItems();
		for(int nLoop = 0; nLoop < nItems; nLoop++) {
			aLens = parseLens();
			Arrays.sort(aLens);
			if (aLens != null) {
				if (aLens[0] * aLens[0] + aLens[1] * aLens[1] == aLens[2] * aLens[2]) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
		}
	}

	private static int parseItems() {
		int nitems = 0;

		try {
			String line = br.readLine();
			if (line != null) {
				int	n1 = Integer.parseInt(line);
				nitems = n1;
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}
		

		return nitems;
	}

	private static int[] parseLens() {
		int[] aParams = null;

		try {
			String line = br.readLine();
			if (line != null) {
				aParams = new int[3];

				String[]	as  = line.split(" ");
				int			n1 = Integer.parseInt(as[0]);
				int			n2 = Integer.parseInt(as[1]);
				int			n3 = Integer.parseInt(as[2]);

				aParams[0] = getTrueLen(n1);
				aParams[1] = getTrueLen(n2);
				aParams[2] = getTrueLen(n3);
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}
		

		return aParams;
	}

	private static int getTrueLen(int nLen) {
		int nTrueLen = -1;

		if (1 <= nLen && nLen <= 1000) {
			nTrueLen = nLen;
		}

		return nTrueLen;
	}
}