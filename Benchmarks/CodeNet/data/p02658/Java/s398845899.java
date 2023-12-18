import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger[] an = new BigInteger[n];

		for (int i = 0; i < n; i++) {
			BigInteger a = scan.nextBigInteger();
			an[i] = a;
		}

		BigInteger ans = an[0];
		for (int i = 1; i < an.length; i++) {
			ans = ans.multiply(an[i]);
		}

		if (ans.compareTo(BigInteger.valueOf((long)Math.pow(10, 18))) < 1) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}

		scan.close();
	}

}
