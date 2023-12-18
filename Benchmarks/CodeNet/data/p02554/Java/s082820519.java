import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int m = 1000000007;
		long a = powMod(10, n, m);
		long b = powMod(9, n, m);
		long c = powMod(8, n, m);
		long ans = a - b - b + c + m + m;
		ans %= m;
		System.out.println(ans);
	}

	/**
	 * xのn乗をmで割った余り
	 */
	static long powMod(long x, long n, int m) {
		assert 0 <= n : "n=" + n;
		assert 1 <= m : "m=" + m;

		if (m == 1) {
			return 0;
		}
		long r = 1;
		long y = x % m;
		if (y < 0) {
			y += m;
		}
		while (n > 0) {
			if ((n & 1) == 1) {
				r = r * y % m;
			}
			y = y * y % m;
			n >>= 1;
		}
		return r;
	}
}
