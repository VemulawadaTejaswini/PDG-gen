import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int A = Integer.parseInt(sc.get());
		int V = Integer.parseInt(sc.get());
		int B = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		int T = Integer.parseInt(sc.get());
		int length = Math.abs(A - B);
		if (V == W) {
			System.out.println("NO");
			return;
		}
		var time = -Math.floorDiv(-length, (V - W));
		System.out.println(time > 0 && T >= time ? "YES" : "NO");
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