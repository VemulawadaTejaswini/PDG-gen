import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		Arrays.sort(A);

		long[] paired = new long[N];
		int[] minus = new int[N];
		int[] plus = new int[N];
		{
			int midx = 0, pidx = 0;
			for (int value : A) {
				if (value >= 0) {
					plus[pidx++] = -value;
				} else {
					minus[midx++] = value;
				}
			}
			minus = Arrays.copyOf(minus, midx);
			plus = Arrays.copyOf(plus, pidx);
			Arrays.sort(minus);
			Arrays.sort(plus);
		}

		if (plus.length == 0 && K % 2 != 0) {
			Integer[] abs = new Integer[N];
			Arrays.setAll(abs, i -> A[i]);
			Arrays.sort(abs, Comparator.comparingInt(Math::abs));
			int result = 1;
			for (int i = 0; i < K; i++) {
				result = mul(result, mod(abs[i]));
			}
			System.out.println(result);
			return;
		}

		int ridx = 0;
		for (int i = 0; i + 1 < minus.length; i += 2) {
			paired[ridx++] = (long) minus[i] * minus[i + 1];
		}
		int i = 0;
		int k = 0;
		int result = 1;
		if (K % 2 != 0) {
			result = mul(result, mod(-plus[i++]));
			k += 1;
		}
		for (; i + 1 < plus.length; i += 2) {
			paired[ridx++] = (long) plus[i] * plus[i + 1];
		}
		Arrays.sort(paired);

		int idx = 0;
		for (; k < K; k += 2) {
			result = mul(result, mod(paired[paired.length - 1 - idx++]));
		}
		System.out.println(result);

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