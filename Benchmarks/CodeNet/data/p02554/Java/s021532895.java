import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		if (N == 1) {
			System.out.println(0);
			return;
		}

		// 10^n - 8^n - 2(9^n - 8^n)
		System.out.println(sub(sub(pow(10, N), pow(8, N)), mul(2, sub(pow(9, N), pow(8, N)))));
	}

	static final int MOD = 1000000007;

	int mod(long val) {
		return Math.floorMod(val, MOD);
	}

	int add(long a, long b) {
		return mod(a + b);
	}

	int sub(long a, long b) {
		return add(a, -b);
	}

	int mul(long a, long b) {
		return mod(a * b);
	}

	int pow(long a, long n) {
		int res = 1;
		for (; n > 0; n /= 2) {
			if (n % 2 == 1) res = mul(res, a);
			a = mul(a, a);
		}
		return res;
	}

	long[] factorial;
	long[] facInverse;
	long[] inverse;

	void initNCR() {
		int MOD = 1000000007;
		int MAX = 1000000 + 7;
		factorial = new long[MAX];
		facInverse = new long[MAX];
		inverse = new long[MAX];
		factorial[0] = factorial[1] = 1;
		facInverse[0] = facInverse[1] = 1;
		inverse[1] = 1;
		for (int i = 2; i < MAX; i++) {
			factorial[i] = factorial[i - 1] * i % MOD;
			long inv = inverse[i] = MOD - inverse[MOD % i] * (MOD / i) % MOD;
			facInverse[i] = facInverse[i - 1] * inv % MOD;
		}
	}

	int ncr(int n, int r) {
		if (n < r) return 0;
		if (n < 0 || r < 0) return 0;
		return (int) (factorial[n] * (facInverse[r] * facInverse[n - r] % 1000000007) % 1000000007);
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}