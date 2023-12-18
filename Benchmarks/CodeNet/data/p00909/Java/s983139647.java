import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0 && M == 0)
				break;
			WeightedUnionFind uf = new WeightedUnionFind(N);
			for (int i = 0; i < M; i++) {
				String s = sc.next();
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				if (s.equals("!")) {
					int w = sc.nextInt();
					uf.union(x, y, w);
				} else {
					if (!uf.same(x, y)) {
						System.out.println("UNKNOWN");
					} else {
						System.out.println(-uf.diff(x, y));
					}
				}
			}
		}
		sc.close();
	}

	class WeightedUnionFind {
		int[] par;
		int[] wd;

		public WeightedUnionFind(int n) {
			par = new int[n];
			wd = new int[n];
			Arrays.fill(par, -1);
		}

		int find(int x) {
			if (par[x] < 0)
				return x;
			else {
				final int parent = find(par[x]);
				wd[x] += wd[par[x]];
				par[x] = parent;
				return parent;
			}
		}

		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		int weight(int x) {
			find(x);
			return wd[x];
		}

		// y - x = w ??? y = x + w;
		boolean union(int x, int y, int w) {
			if (find(x) == find(y))
				return false;
			else {
				w += (weight(x) - weight(y));
				x = find(x);
				y = find(y);
				par[y] = x;
				wd[y]=w;
				return true;
			}
		}

		// return x-y
		int diff(int x, int y) {
			if (!same(x, y)) {
				throw new AssertionError();
			} else {
				return weight(x) - weight(y);
			}
		}
	}
}