import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BigInteger MAX = new BigInteger("1000000000000000000");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] s = new BigInteger[n];
		BigInteger ans = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextBigInteger();
			if (s[i].compareTo(BigInteger.ZERO) == 0) {
				System.out.println(0);
				System.exit(0);
			}
		}

		for (int i = 0; i < n; i++) {
			ans = ans.multiply(s[i]);
			if (ans.compareTo(MAX) == 1) {
				System.out.println(-1);
				System.exit(0);
			}
		}

		System.out.println(ans);
	}
}