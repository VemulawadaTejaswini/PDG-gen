import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] bucket = new int[100000 + 2];
		long sum = 0;
		for (int value : A) {
			bucket[value]++;
			sum += value;
		}

		int Q = Integer.parseInt(sc.get());
		for (int i = 0; i < Q; i++) {
			int B = Integer.parseInt(sc.get());
			int C = Integer.parseInt(sc.get());
			sum -= (long) B * bucket[B];
			sum += (long) C * bucket[B];
			bucket[C] += bucket[B];
			bucket[B] = 0;
			System.out.println(sum);
		}
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