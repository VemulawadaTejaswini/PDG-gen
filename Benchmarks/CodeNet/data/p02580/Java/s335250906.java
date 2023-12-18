import java.io.*;
import java.util.*;
import java.util.function.*;

final class Indexed<T> {
	int index;
	T obj;

	public Indexed(int index, T obj) {
		this.index = index;
		this.obj = obj;
	}
}

final class Target {
	int y, x;

	public Target(int y, int x) {
		this.y = y;
		this.x = x;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Target target = (Target) o;
		return y == target.y && x == target.x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(y, x);
	}
}

final class Solver {
	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());

		var targets = new HashSet<Target>();
		for (int i = 0; i < M; i++) {
			int y = Integer.parseInt(sc.get()) - 1;
			int x = Integer.parseInt(sc.get()) - 1;
			targets.add(new Target(y, x));
		}

		var vertical = new PriorityQueue<>(Comparator.comparingInt((Indexed<HashSet<Target>> i) -> i.obj.size()).reversed());
		var horizontal = new PriorityQueue<>(Comparator.comparingInt((Indexed<HashSet<Target>> i) -> i.obj.size()).reversed());
		{
			var vlist = new ArrayList<HashSet<Target>>();
			var hlist = new ArrayList<HashSet<Target>>();
			for (int i = 0; i < H; i++) {
				vlist.add(new HashSet<>());
			}
			for (int i = 0; i < W; i++) {
				hlist.add(new HashSet<>());
			}

			for (Target target : targets) {
				vlist.get(target.y).add(target);
				hlist.get(target.x).add(target);
			}

			for (int i = 0; i < vlist.size(); i++) {
				vertical.add(new Indexed<>(i, vlist.get(i)));
			}

			for (int i = 0; i < hlist.size(); i++) {
				horizontal.add(new Indexed<>(i, hlist.get(i)));
			}
		}

		var vmax = vertical.remove();
		var hmax = horizontal.remove();
		var ambig = vmax.obj.size() + hmax.obj.size();
		var actual = ambig - (targets.contains(new Target(vmax.index, hmax.index)) ? 1 : 0);
		while (!vertical.isEmpty() && !horizontal.isEmpty()){
			var vnext = vertical.remove();
			var hnext = horizontal.remove();
			if (ambig > vnext.obj.size() + hnext.obj.size()) break;
			actual = Math.max(actual, vnext.obj.size() + hnext.obj.size() - (targets.contains(new Target(vnext.index, hnext.index)) ? 1 : 0));
		}

		System.out.println(actual);
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