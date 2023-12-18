import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		Arrays.sort(A);

		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
		queue.add(A[A.length - 1]);
		long sum = 0;
		for (int i = A.length - 2; i >= 0; i--) {
			int rem = queue.remove();
			sum += rem;

			queue.add(A[i]);
			queue.add(A[i]);
		}
		System.out.println(sum);
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