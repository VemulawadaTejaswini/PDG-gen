
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static ArrayList<List<Integer>>[] questions;
	static int N;
	static DJSet ds;
	static String[] ans;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int k = sc.nextInt();

		int[][] query = new int[k][];
		questions = new ArrayList[k];
		ans = new String[k];
		ArrayList<List<Integer>> operations = new ArrayList<>();
		HashMap<List<Integer>, Integer> cnt = new HashMap<>();
		for (int i = 0; i < k; ++i) {
			questions[i] = new ArrayList<>();
		}
		for (int i = 0; i < k; ++i) {
			int type = sc.nextInt();
			int u = sc.nextInt();
			int v = sc.nextInt();
			query[i] = new int[] { type, i, u, v };
			if (type == 3) {
				questions[i].add(Arrays.asList(u, v));
			} else {
				if (type == 1) {
					cnt.put(Arrays.asList(u, v), i);
				} else if (type == 2) {
					operations.add(Arrays.asList(u, v, cnt.get(Arrays.asList(u, v)), i));
					cnt.put(Arrays.asList(u, v), -1);
				}
			}
		}

		for (Entry<List<Integer>, Integer> entry : cnt.entrySet()) {
			int t = entry.getValue();
			if (t > 0) {
				int u = entry.getKey().get(0);
				int v = entry.getKey().get(1);
				operations.add(Arrays.asList(u, v, t, k));
			}
		}

		// for (int i = 0; i < k; ++i) {
		// if (query[i][0] == 1) {
		// int u = query[i][2];
		// int v = query[i][3];
		// int t = cnt.get(Arrays.asList(u, v));
		// if (t != -1 && t == i) {
		// operations.add(Arrays.asList(u, v, t, k));
		// }
		// }
		// }

		SegTree seg = new SegTree(k);
		for (List<Integer> op : operations) {
			seg.update(op.get(2), op.get(3), new Edge(op.get(0), op.get(1)));
		}

		ds = new DJSet(N);

		seg.dfs(0);

		for (String out : ans) {
			if (out != null) {
				System.out.println(out);
			}
		}

	}

	static class SegTree {
		int n = 1;
		ArrayList<Edge>[] edges;

		@SuppressWarnings("unchecked")
		public SegTree(int n_) {
			while (n < n_)
				n *= 2;
			edges = new ArrayList[2 * n - 1];
			for (int i = 0; i < edges.length; ++i) {
				edges[i] = new ArrayList<>();
			}
		}

		void update(int a, int b, Edge e) {
			update(a, b, 0, n, 0, e);
		}

		void update(int a, int b, int l, int r, int k, Edge e) {
			if (a >= r || b <= l)
				return;
			else if (a <= l && r <= b) {
				edges[k].add(e);
			} else {
				update(a, b, l, (l + r) / 2, 2 * k + 1, e);
				update(a, b, (l + r) / 2, r, 2 * k + 2, e);
			}
		}

		void dfs(int k) {
			if (k >= 2 * n - 1)
				return;
			for (Edge e : edges[k]) {
				ds.setUnion(e.src, e.dst);
			}
			if (k < n - 1) {
				dfs(2 * k + 1);
				dfs(2 * k + 2);
			} else {
				int pos = k - (n - 1);
				if (pos < questions.length)
					for (List<Integer> q : questions[pos]) {
						if (ds.equiv(q.get(0), q.get(1))) {
							ans[pos] = "YES";
						} else {
							ans[pos] = "NO";
						}
					}
			}

			for (Edge e : edges[k]) {
				ds.undo();
			}
		}

	}

	static class DJSet {
		int n;
		int[] upper;
		ArrayDeque<List<Integer>> cmds = new ArrayDeque<>();

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
			cmds.addFirst(Arrays.asList(x, upper[x]));
			cmds.addFirst(Arrays.asList(y, upper[y]));
			if (x != y) {
				if (upper[x] > upper[y]) {
					int d = x;
					x = y;
					y = d;
				}
				upper[x] += upper[y];
				upper[y] = x;
			}
			return x != y;
		}

		boolean undo() {
			if (cmds.isEmpty())
				throw new AssertionError();
			else {
				List<Integer> y = cmds.pollFirst();
				List<Integer> x = cmds.pollFirst();
				upper[y.get(0)] = y.get(1);
				upper[x.get(0)] = x.get(1);
				return true;
			}
		}
	}

	static class Edge {
		int src;
		int dst;

		public Edge(int src, int dst) {
			this.src = src;
			this.dst = dst;
		}
	}
}