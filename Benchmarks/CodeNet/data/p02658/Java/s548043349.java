
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long startMillisTime = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger[] an = new BigInteger[n];

		for (int i = 0; i < n; i++) {
			BigInteger a = scan.nextBigInteger();
			an[i] = a;
		}

		BigInteger ans = BigInteger.valueOf(1);
		for (int i = 0, j = an.length; i < n; i++) {
			ans = multiply(ans, an[i]);
		}

		if (ans.compareTo(BigInteger.valueOf((long)Math.pow(10, 18))) < 1) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
		long endMillisTime = System.currentTimeMillis();

//		System.out.println("処理時間（ミリ）：" + (endMillisTime - startMillisTime) + " ms");

		scan.close();
	}

	private static BigInteger multiply(BigInteger val1, BigInteger val2) {
		BigInteger res = val1.multiply(val2);
		return res;
	}

}
