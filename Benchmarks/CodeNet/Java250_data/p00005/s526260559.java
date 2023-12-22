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
		int[]	aPair = null;

		while((aPair = parsePair()) != null) {
			calc(aPair);
		}
	}

	private static int[] parsePair() {
		int[]	aPair = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					aPair = new int[2];
	
					String[]	as = line.split(" ");
					int			n1 = Integer.parseInt(as[0]);
					int			n2 = Integer.parseInt(as[1]);
	
					aPair[0] = n1;
					aPair[1] = n2;
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return aPair;
	}

	private static void calc(int[] aMatrix) {
		int	nGcd = gcd(aMatrix[0], aMatrix[1]);							// 最大公約数
		int	nLcm = (nGcd == 0) ? 0 : aMatrix[0] * (aMatrix[1] / nGcd);	// 最小公倍数

		System.out.printf("%d %d\n", nGcd, nLcm);
	}

	private static int gcd(int n1, int n2) {
		int		nGcd = 0;			// 最大公約数
		int[]	aNum = new int[3];	// 計算用の配列

		if (n1 == n2) {
			nGcd = n1;
		}
		else {
			aNum[0] = n1;
			aNum[1] = n2;
			aNum[2] = Math.abs(n1 - n2);

			Arrays.sort(aNum);
			nGcd = gcd(aNum[0], aNum[1]);
		}
		
		return nGcd;
	}
}