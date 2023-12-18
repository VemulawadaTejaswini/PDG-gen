import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		for (int i = K; i < N; i++) {
			System.out.println(A[i - K] < A[i] ? "Yes" : "No");
		}
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