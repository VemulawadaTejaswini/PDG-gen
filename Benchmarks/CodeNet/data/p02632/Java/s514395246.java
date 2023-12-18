import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		int mod = 1000000007;
		int n = s.length;
		NCR ncr = new NCR(n + k, mod);
		long ans = 0;
		for (int i = n; i <= n + k; i++) {
			long val1 = ncr.calc(i - 1, n - 1);
			long val2 = power(25, i - n, mod);
			long val3 = power(26, k - (i - n), mod);
			long val = val1 * val2 % mod * val3 % mod;
			ans += val;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static class NCR {
		long[] p, pi;
		int m;

		public NCR(int n, int mod) {
			n++;
			m = mod;
			p = new long[n];
			pi = new long[n];
			p[0] = 1;
			pi[0] = 1;
			for (int i = 1; i < n; i++) {
				p[i] = p[i - 1] * i % m;
			}
			pi[n - 1] = BigInteger.valueOf(p[n - 1])
					.modInverse(BigInteger.valueOf(m)).longValue();
			for (int i = n - 1; i > 1; i--) {
				pi[i - 1] = pi[i] * i % m;
			}
		}

		public long calc(int n, int r) {
			if (n < r) return 0;
			return p[n] * pi[r] % m * pi[n - r] % m;
		}
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}
}
