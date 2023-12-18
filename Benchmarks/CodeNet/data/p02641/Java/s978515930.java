import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		int N = Integer.parseInt(sc.get());
		BitSet bs = new BitSet(100 + 1);
		for (int i = 0; i < N; i++) {
			int p = Integer.parseInt(sc.get());
			bs.set(p);
		}

		int abs = X + 1;
		int value = -1;
		for (int i = 0; i <= 101; i++) {
			if (bs.get(i)) continue;
			if (abs > Math.abs(X - i)){
				abs = Math.abs(X - i);
				value = i;
			}
		}
		System.out.println(value);
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