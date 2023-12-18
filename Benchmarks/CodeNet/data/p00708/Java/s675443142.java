import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static double[] x, y, z, r;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			x = new double[N];
			y = new double[N];
			z = new double[N];
			r = new double[N];
			for (int i = 0; i < N; ++i) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
			}
			ArrayList<Edge> edges = new ArrayList<Edge>();
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < i; ++j) {
					 edges.add(new Edge(i, j, dist(i, j)));
				}
			}
			Collections.sort(edges);
			UnionFind uf = new UnionFind(N);
			double ans = 0;
			for (Edge e : edges) {
				if(uf.find(e.f, e.t)) continue;
				ans += e.v;
				uf.union(e.f, e.t);
			}
			System.out.printf("%.3f\n", ans);
		}
	}

	static class UnionFind {
		int[] set;

		UnionFind(int n) {
			set = new int[n];
			Arrays.fill(set, -1);
		}

		void union(int a, int b) {
			int rtA = root(a);
			int rtb = root(b);
			if (rtA == rtb) {
				return;
			}
			set[rtA] += set[rtb];
			set[rtb] = rtA;
		}

		boolean find(int a, int b) {
			return root(a) == root(b);
		}

		int root(int a) {
			if (set[a] < 0) {
				return a;
			} else {
				set[a] = root(set[a]);
				return set[a];
			}
		}

		int size(int a) {
			return -set[root(a)];
		}
	}

	static class Edge implements Comparable<Edge> {
		int f, t;
		double v;

		Edge(int f, int t, double v) {
			this.f = f;
			this.t = t;
			this.v = v;
		}

		public int compareTo(Edge o) {
			return Double.compare(this.v, o.v);
		}
	}

	static double dist(int i, int j) {
		double d = Math.sqrt(sq(x[i] - x[j]) + sq(y[i] - y[j]) + sq(z[i] - z[j]));
		return Math.max(0, d - r[i] - r[j]);
	}

	static double sq(double v) {
		return v * v;
	}

}