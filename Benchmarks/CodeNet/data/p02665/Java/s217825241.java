import java.io.*;
import java.math.*;
import java.util.*;
import java.util.function.*;

class Depth{

}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N + 1];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));


		int[] v = new int[N + 1];

		int child = v[A.length - 1] = A[A.length - 1];
		for (int i =A.length - 2; i >= 0; i--) {
			v[i] = child = A[i] + -Math.floorDiv(-child, 2);
		}

		if (v[0] > 1) {
			System.out.println(-1);
			return;
		}

		long vertex = 1 + A[A.length- 1];
		for (int i = 1; i < A.length - 1; i++) {
			vertex += (v[i] = Math.min(v[i - 1] * 2, v[i + 1]));
		}

		System.out.println(vertex);
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
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