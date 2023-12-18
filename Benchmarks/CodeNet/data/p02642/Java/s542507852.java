import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		BitSet multiple = new BitSet(1000002);
		BitSet bs = new BitSet(1000002);
		int max = 0;
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(sc.get());
			if (bs.get(a)) multiple.set(a);
			bs.set(a);
			max = Math.max(max, a);
		}

		if (bs.get(1)) {
			System.out.println(0);
			return;
		}

		for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
			if (multiple.get(i)) {
				bs.clear(i);
			}
			for (int j = i + i; j <= max; j += i) {
				bs.clear(j);
			}
		}
		System.out.println(bs.cardinality());
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