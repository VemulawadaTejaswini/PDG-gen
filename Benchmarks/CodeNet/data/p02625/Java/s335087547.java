import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		br.close();

		int mod = 1000000007;
		NCR ncr = new NCR(m, mod);
		long sum = 0;
		for (int i = 0; i <= n; i++) {
			long val1 = ncr.comb(n, i);
			long val2 = ncr.perm(m - i, n - i);
			long val = val1 * val2 % mod;
			if (i % 2 == 0) {
				sum += val;
			} else {
				sum = sum - val + mod;
			}
			sum %= mod;
		}
		long ans = sum * ncr.perm(m, n) % mod;
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

		public long comb(int n, int r) {
			if (n < r) return 0;
			return p[n] * pi[r] % m * pi[n - r] % m;
		}

		public long perm(int n, int r) {
			if (n < r) return 0;
			return p[n] * pi[n - r] % m;
		}
	}
}
