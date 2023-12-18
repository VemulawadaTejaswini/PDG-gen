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


		int heaven = 1;
		for (int i = 0; i < K; i++) {
			heaven = mul(heaven, A[A.length - 1 - i]);
		}


		int result = 1;
		int count = 0;
		int r = A.length - 1;
		minpul:for (int l = 0; l < A.length - 1; l += 2) {
			if (count >= K - 1) break;

			int minus1 = A[l];
			int minus2 = A[l + 1];
			if (minus2 >= 0) break;

			long mulmin = (long) minus1 * minus2;
			while (true) {
				if (r == l || r - 1 == l + 1) break minpul;
				if (count >= K - 1) break minpul;

				int plus1 = A[r];
				int plus2 = A[r - 1];
				long mulpul = (long) plus1 * plus2;
				if (mulmin < mulpul){
					result = mul(result, mulpul);
					count += 2;
					r -= 2;
				} else {
					break;
				}
			}

			result = mul(result, mulmin);
			count += 2;
		}

		if (count == K){
			System.out.println(result);
			return;
		}

		for (int i = r; i >= 0; i--) {
			if (count >= K) break;
			if (A[i] <= 0) break;

			result = mul(result, A[i]);
			count += 1;
		}

		if (K != count) {
			System.out.println(heaven);
			return;
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