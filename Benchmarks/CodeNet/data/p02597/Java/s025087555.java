import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		String S = sc.get();
		var chars = S.toCharArray();
		int leftmostW = 0;
		int rightmostR = chars.length - 1;
		int count = 0;
		outer:
		for (; leftmostW < chars.length; leftmostW++) {
			if (chars[leftmostW] != 'W') continue;
			while (chars[rightmostR] != 'R') {
				if (rightmostR-- <= leftmostW) break outer;
			}
			if (rightmostR <= leftmostW) break;
			chars[leftmostW] = 'R';
			chars[rightmostR] = 'W';
			count++;
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