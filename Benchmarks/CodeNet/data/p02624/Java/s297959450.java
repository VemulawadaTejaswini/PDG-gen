import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] count = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= N; j+=i) {
				count[j] += 1;
			}
		}
		long result = 0;
		for (int i = 1; i <= N; i++) {
			result += (long) i * count[i];
		}
		System.out.println(result);
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