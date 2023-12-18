import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		var A = new long[N];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));
		int MOD = 1000000000 + 7;

		var cum = new long[N];
		cum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			cum[i] = A[i] + cum[i - 1];
			cum[i] %= MOD;
		}

		long ans = 0;
		for (int i = 0; i < A.length; i++) {
			ans += Math.floorMod(cum[N - 1] - cum[i], MOD) * A[i];
			ans %= MOD;
		}
		System.out.println(ans);
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