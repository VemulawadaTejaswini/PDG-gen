import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] B = new int[M];
		Arrays.setAll(B, $ -> Integer.parseInt(sc.get()));
		var cumA = new long[N];
		cumA[0] = A[0];
		for (int i = 1; i < N; i++) {
			cumA[i] = cumA[i - 1] + A[i];
		}
		var cumB = new long[M];
		cumB[0] = B[0];
		for (int i = 1; i < M; i++) {
			cumB[i] = cumB[i - 1] + B[i];
		}
		int max = 0;
		int prevB = 0;
		for (int i = N - 1; i >= 0; i--) {
			long time = cumA[i];
			if (time > K) continue;
			int count = i;
			for (int j = prevB; j < cumB.length; j++) {
				if (time + cumB[j] <= K) {
					count = i + j + 2;
				} else break;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
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