import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static ArrayList<Edge> E;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			E = new ArrayList<Edge>();
			for (int i = 0; i < M; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int w = sc.nextInt();
				E.add(new Edge(a, b, w));
			}
			Collections.sort(E);
			System.out.println(solve());
		}
	}

	static int solve() {
		int ans = 9999;
		for (int i = 0; i < M; ++i) {
			if (i != 0 && E.get(i).w == E.get(i - 1).w) continue;
			UnionFind uf = new UnionFind(N);
			for (int j = i; j < M; ++j) {
				Edge e = E.get(j);
				int diff = e.w - E.get(i).w;
				if (diff >= ans) break;
				uf.union(e.f, e.t);
				if (uf.size(0) == N) {
					ans = diff;
					break;
				}
			}
		}
		return ans == 9999 ? -1 : ans;
	}

	static class Edge implements Comparable<Edge> {
		int f, t, w;

		public Edge(int f, int t, int w) {
			this.f = f;
			this.t = t;
			this.w = w;
		}

		public int compareTo(Edge o) {
			return this.w - o.w;
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

}