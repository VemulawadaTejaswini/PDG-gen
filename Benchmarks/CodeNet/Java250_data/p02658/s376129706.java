import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextBigInteger();
			if (a[i].compareTo(BigInteger.ZERO) == 0) {
				System.out.println(0);
				return;
			}
		}
		sc.close();

		BigInteger lim = BigInteger.valueOf(1000000000000000000L);
		BigInteger ans = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			ans = ans.multiply(a[i]);
			if (ans.compareTo(lim) > 0) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(ans.toString());
	}
}
