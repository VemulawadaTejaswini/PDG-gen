import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	class State {
		int i;
		int parent;
		int j;// in next step,go into g[i][j]

		public State(int i_, int parent_, int j_) {
			i = i_;
			parent = parent_;
			j = j_;
		}
	}

	int strongly_connected_componets(ArrayList<Integer>[] g, int[] col) {
		int n = g.length;
		Arrays.fill(col, -1);
		int cols = 0;
		int[] low = new int[n];
		int[] ord = new int[n];
		boolean[] marked = new boolean[n];
		Arrays.fill(low, -1);
		Arrays.fill(ord, -1);
		int order = 0;
		ArrayDeque<State> stk = new ArrayDeque<>();
		ArrayDeque<Integer> pnd = new ArrayDeque<>();
		for (int ii = 0; ii < n; ++ii) {
			if (ord[ii] == -1) {
				stk.add(new State(ii, -1, 0));
			}
			while (!stk.isEmpty()) {
				State s = stk.pollFirst();
				if (ord[s.i] == -1) {
					low[s.i] = (ord[s.i] = order++);
					pnd.addFirst(s.i);
				}
				if (s.j > 0 && s.parent != g[s.i].get(s.j - 1) && !marked[g[s.i].get(s.j - 1)]) {
					if (low[g[s.i].get(s.j - 1)] == -1) {
						throw new AssertionError();
					}
					low[s.i] = Math.min(low[s.i], low[g[s.i].get(s.j - 1)]);
				}
				if (s.j == g[s.i].size() && low[s.i] == ord[s.i]) {
					while (true) {
						int v = pnd.pollFirst();
						col[v] = cols;
						marked[v] = true;
						if (v == s.i)
							break;
					}
					++cols;
					continue;
				}
				if (s.j == g[s.i].size())
					continue;
				int v = g[s.i].get(s.j);
				stk.addFirst(new State(s.i, s.parent, s.j + 1));
				if (ord[v] == -1) {
					stk.addFirst(new State(v, s.i, 0));
				} else if (!marked[v]) {
					low[s.i] = Math.min(low[s.i], low[v]);
				}
			}
		}
		return cols;
	}

	@SuppressWarnings("unchecked")
	public void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int V = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Integer>[] g = new ArrayList[V];
		for (int i = 0; i < V; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
		}
		int[] col = new int[V];
		strongly_connected_componets(g, col);
		int q = sc.nextInt();
		while (q-- > 0) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			System.out.println(col[u] == col[v] ? "1" : "0");
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}