import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[][] h;
	static int[] h2;
	static ArrayList<Edge>[] g;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if (N == 0 && M == 0)
				break;
			h = new int[N][2];
			h2 = new int[N];
			for (int i = 0; i < N; ++i) {
				h[i] = new int[] { i, sc.nextInt() };
				h2[i] = h[i][1];
			}
			Arrays.sort(h, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return -Integer.compare(o1[1], o2[1]);
				}
			});
			ArrayList<Edge> elis = new ArrayList<>();
			g = new ArrayList[N];
			for (int i = 0; i < N; ++i)
				g[i] = new ArrayList<>();
			for (int i = 0; i < M; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = sc.nextInt();
				g[a].add(new Edge(a, b, c));
				g[b].add(new Edge(b, a, c));
				elis.add(new Edge(a, b, c));
				elis.add(new Edge(b, a, c));
			}

			Collections.sort(elis);
			DJSet ds = new DJSet(N);
			long ans = 0;
			for (int i = 0; i < N; ++i) {
				while (i + 1 < N && h[i][1] == h[i + 1][1])
					++i;
				int t = h[i][1];
				int v = h[i][0];
				for (Edge e : elis) {
					if (h2[e.src] >= t && h2[e.dst] >= t && !ds.equiv(e.src, e.dst)) {
						ds.setUnion(e.src, e.dst);
						ans += e.cost;
					}
				}
				if (ds.size(v) != i + 1) {
					ds.clear();
					ans = 0;
				}
			}

			System.out.println(ans);
		}
	}

	static class Edge implements Comparable<Edge> {
		int src;
		int dst;
		int cost;

		public Edge(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(cost, o.cost);
		}
	}

	static class DJSet {
		int n;
		int[] upper;

		public DJSet(int n) {
			this.n = n;
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		boolean setUnion(int x, int y) {
			x = root(x);
			y = root(y);

			if (x != y) {
				if (upper[x] < upper[y]) {
					int d = x;
					x = y;
					y = d;
				}
				upper[y] += upper[x];
				upper[x] = y;
			}
			return x != y;
		}

		void clear() {
			Arrays.fill(upper, -1);
		}

		int size(int x) {
			return -upper[root(x)];
		}

	}
}