
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		DisjoinSet ds = new DisjoinSet(n);
		for (int i = 0; i < q; i++) {
			int t = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (t == 0)
				ds.unite(a, b);
			else {
				if (ds.same(a, b))
					System.out.println(1);
				else
					System.out.println(0);
			}

		}

	}

	class DisjoinSet {
		int[] rank;
		int[] p;

		DisjoinSet(int size) {
			rank = new int[size];
			p = new int[size];
			for (int i = 0; i < size; i++) {
				p[i] = i;
			}
		}

		int findSet(int x) {
			while (true) {
				if (x == p[x])
					return x;
				x = p[x];
			}
		}

		public boolean same(int a, int b) {
			return findSet(a) == findSet(b);
		}

		public void unite(int a, int b) {
			link(findSet(a), findSet(b));
		}

		private void link(int x, int y) {
			if (rank[x] > rank[y]) {
				p[y] = x;
			} else {
				p[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
		}
	}
}