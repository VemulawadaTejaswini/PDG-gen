import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		long l = Long.parseLong(sc.get());
		var s = Long.toString(l, 26).toCharArray();
		char[] result = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a')
				result[i] = (char) (s[i] + 9);
			else result[i] = (char) (s[i] + ('a' - '0' - 1));
		}
		System.out.println(String.valueOf(result));
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