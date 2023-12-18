import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		var S = sc.get();
		var T = sc.get().toCharArray();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < S.length() - T.length + 1; i++) {
			var seq = S.substring(i, i + T.length).toCharArray();
			int count = 0;
			for (int j = 0; j < seq.length; j++) {
				if (seq[j] != T[j]) {
					count++;
				}
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
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