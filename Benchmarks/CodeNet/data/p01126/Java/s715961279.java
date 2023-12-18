import java.util.HashMap;
import java.util.Scanner;

public class Main {

	int n, m, a;
	int h, p, q;

	public class Pair {
		int h;
		int from;

		Pair(int h, int from) {
			this.h = h;
			this.from = from;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Pair) {
				Pair p = (Pair) obj;
				return this.h == p.h && this.from == p.from;
			}
			return false;
		}
		@Override
		public int hashCode() {
			return this.h+from*37;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			a = sc.nextInt();
			if (n == 0 && m == 0 && a == 0) {
				break;
			}

			HashMap<Pair, Integer> nodes = new HashMap<Main.Pair, Integer>();

			for (int i = 0; i < n; i++) {
				h = sc.nextInt();
				p = sc.nextInt();
				q = sc.nextInt();
				nodes.put(new Pair(h, p), q);
				nodes.put(new Pair(h, q), p);
			}
			int now = a;
			for (int i = 999; i >= 0; i--) {
				Pair pair = new Pair(i, now);
				if (nodes.containsKey(pair)) {
					int nxt = nodes.get(pair);
					if (nxt > 0)
						now = nxt;
				}
			}
			pr(now);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.println(o);
	}

	public static void pr() {
		System.out.println();
	}
}