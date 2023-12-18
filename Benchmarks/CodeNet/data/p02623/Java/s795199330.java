import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		var A = new ArrayDeque<Integer>();
		for (int i = 0; i < N; i++) {
			A.addLast(Integer.parseInt(sc.get()));
		}
		var B = new ArrayDeque<Integer>();
		for (int i = 0; i < M; i++) {
			B.addLast(Integer.parseInt(sc.get()));
		}
		long time = 0;
		int count = 0;
		while (time <= K) {
			var a = A.peekFirst();
			var b = B.peekFirst();
			if (a == null && b == null) break;
			if (a == null) {
				time += B.removeFirst();
			} else if (b == null) {
				time += A.removeFirst();
			} else if (a > b) {
				time += B.removeFirst();
			} else {
				time += A.removeFirst();
			}
			if (time > K) break;
			count += 1;
		}
		System.out.println(count);
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