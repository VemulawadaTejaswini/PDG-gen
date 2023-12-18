import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		BitSet multiple = new BitSet(1000002);
		BitSet bs = new BitSet(1000002);
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(sc.get());
			if (bs.get(a)) multiple.set(a);
			bs.set(a);
		}
		if (bs.get(1) || bs.cardinality() == 1){ // 1があるか、2つ以上存在しない場合
			System.out.println(0);
			return;
		}
		int count = 0;
		parent:
		for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
			for (int j = 2; ; j++) {
				var div = i / j;
				if (div <= 1) break;
				if (i % j == 0) {
					if (bs.get(div)) {
						continue parent; // リストのうちのどれかで割り切れる
					}
				}
			}
			count += 1;
		}
		System.out.println(count);
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