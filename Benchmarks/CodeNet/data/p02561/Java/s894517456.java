import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] s = new char[n][m];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();

		MaxFlow mf = new MaxFlow(n * m + 2);
		int x = n * m;
		int y = x + 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (s[i][j] == '#') {
					continue;
				}
				int v = i * m + j;
				if ((i + j) % 2 == 1) {
					mf.addEdge(v, y, 1);
				} else {
					mf.addEdge(x, v, 1);

					if (i > 0 && s[i - 1][j] == '.') {
						mf.addEdge(v, v - m, 1);
					}
					if (i < n - 1 && s[i + 1][j] == '.') {
						mf.addEdge(v, v + m, 1);
					}
					if (j > 0 && s[i][j - 1] == '.') {
						mf.addEdge(v, v - 1, 1);
					}
					if (j < m - 1 && s[i][j + 1] == '.') {
						mf.addEdge(v, v + 1, 1);
					}
				}
			}
		}

		System.out.println(mf.flow(x, y));

		List<MaxFlow.Edge> edges = mf.edges();
		for (MaxFlow.Edge e : edges) {
			if (e.from != x && e.to != y && e.flow > 0) {
				char f, t;
				if (e.from + 1 == e.to) {
					f = '>';
					t = '<';
				} else if (e.from + m == e.to) {
					f = 'v';
					t = '^';
				} else if (e.from - 1 == e.to) {
					f = '<';
					t = '>';
				} else {
					f = '^';
					t = 'v';
				}
				s[e.from / m][e.from % m] = f;
				s[e.to / m][e.to % m] = t;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}

/**
 * 最大流
 */
class MaxFlow {
	private final int n;
	private List<int[]> pos;
	private List<List<Edge2>> g;

	class Edge {
		/** 有向辺の始点 */
		final int from;
		/** 有向辺の終点 */
		final int to;
		/** 最大容量 */
		long cap;
		/** 流量 */
		long flow;

		public Edge(int from, int to, long cap, long flow) {
			this.from = from;
			this.to = to;
			this.cap = cap;
			this.flow = flow;
		}
	}

	private class Edge2 {
		final int to, rev;
		long cap;

		public Edge2(int to, int rev, long cap) {
			this.to = to;
			this.rev = rev;
			this.cap = cap;
		}
	}

	/**
	 * n頂点0辺のグラフを作る。<br>
	 * O(n)
	 * 
	 * @param n 頂点数
	 */
	public MaxFlow(int n) {
		this.n = n;
		pos = new ArrayList<>();
		g = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			g.add(new ArrayList<>());
		}
	}

	/**
	 * fromからtoへ最大容量cap、流量0の辺を追加する。<br>
	 * ならしO(1)
	 * 
	 * @param from 有向辺の始点（0≦from＜n）
	 * @param to 有向辺の終点（0≦to＜n）
	 * @param cap 最大容量（0≦cap）
	 * @return 何番目に追加された辺か
	 */
	int addEdge(int from, int to, long cap) {
		assert 0 <= from && from < n : "from=" + from;
		assert 0 <= to && to < n : "to=" + to;
		assert 0 <= cap : "cap=" + cap;

		int m = pos.size();
		pos.add(new int[] { from, g.get(from).size() });
		g.get(from).add(new Edge2(to, g.get(to).size(), cap));
		g.get(to).add(new Edge2(from, g.get(from).size() - 1, 0));
		return m;
	}

	/**
	 * i番目に追加された辺を取得する。<br>
	 * O(1)
	 * 
	 * @param i 辺のインデックス（0≦i＜辺数）
	 * @return 辺情報
	 */
	Edge getEdge(int i) {
		assert 0 <= i && i < pos.size() : "i=" + i + ", size=" + pos.size();

		Edge2 e = g.get(pos.get(i)[0]).get(pos.get(i)[1]);
		Edge2 re = g.get(e.to).get(e.rev);
		return new Edge(pos.get(i)[0], e.to, e.cap + re.cap, re.cap);
	}

	/**
	 * 全ての辺を取得する。<br>
	 * O(辺数)
	 * 
	 * @return 辺情報リスト
	 */
	List<Edge> edges() {
		int m = pos.size();
		List<Edge> result = new ArrayList<>(m);
		for (int i = 0; i < m; i++) {
			result.add(getEdge(i));
		}
		return result;
	}

	/**
	 * i番目に追加された辺の容量、流量を変更する。他の辺は変更しない。<br>
	 * O(1)
	 * 
	 * @param i 辺のインデックス（0≦i＜辺数）
	 * @param newCap 変更後の容量（0≦newFlow≦newCap）
	 * @param newFlow 変更後の流量（0≦newFlow≦newCap）
	 */
	void changeEdge(int i, long newCap, long newFlow) {
		assert 0 <= i && i < pos.size() : "i=" + i + ", size=" + pos.size();
		assert 0 <= newFlow && newFlow <= newCap : "newCap=" + newCap + ", newFlow=" + newFlow;

		Edge2 e = g.get(pos.get(i)[0]).get(pos.get(i)[1]);
		Edge2 re = g.get(e.to).get(e.rev);
		e.cap = newCap - newFlow;
		re.cap = newFlow;
	}

	/**
	 * 最大流。頂点sからtへ流せるだけ流す。<br>
	 * O(n^2・m)
	 * 
	 * @param s 始点（0≦s＜n）
	 * @param t 終点（0≦t＜n）
	 * @return 流せた量
	 */
	long flow(int s, int t) {
		return flow(s, t, Long.MAX_VALUE);
	}

	/**
	 * 最大流。頂点sからtへflowLimitに達するまで流せるだけ流す。<br>
	 * O(n^2・m)
	 * 
	 * @param s 始点（0≦s＜n）
	 * @param t 終点（0≦t＜n）
	 * @param flowLimit 流量制限
	 * @return 流せた量
	 */
	long flow(int s, int t, long flowLimit) {
		assert 0 <= s && s < n : "s=" + s;
		assert 0 <= t && t < n : "t=" + t;

		int[] level = new int[n];
		int[] iter = new int[n];
		Queue<Integer> que = new ArrayDeque<>();

		long flow = 0;
		while (flow < flowLimit) {
			bfs(s, t, level, que);
			if (level[t] == -1) {
				break;
			}
			Arrays.fill(iter, 0);
			while (flow < flowLimit) {
				long f = dfs(t, flowLimit - flow, s, iter, level);
				if (f <= 0) {
					break;
				}
				flow += f;
			}
		}
		return flow;
	}

	private void bfs(int s, int t, int[] level, Queue<Integer> que) {
		Arrays.fill(level, -1);
		level[s] = 0;
		que.clear();
		que.add(s);
		while (!que.isEmpty()) {
			int v = que.poll();
			for (Edge2 e : g.get(v)) {
				if (e.cap == 0 || level[e.to] >= 0) {
					continue;
				}
				level[e.to] = level[v] + 1;
				if (e.to == t) {
					return;
				}
				que.add(e.to);
			}
		}
	}

	private long dfs(int v, long up, int s, int[] iter, int[] level) {
		if (v == s) {
			return up;
		}
		long res = 0;
		int levelv = level[v];
		while (iter[v] < g.get(v).size()) {
			Edge2 e = g.get(v).get(iter[v]++);
			Edge2 re = g.get(e.to).get(e.rev);
			if (levelv <= level[e.to] || re.cap == 0) {
				continue;
			}
			long d = dfs(e.to, Math.min(up - res, re.cap), s, iter, level);
			if (d <= 0) {
				continue;
			}
			e.cap += d;
			re.cap -= d;
			res += d;
			if (res == up) {
				break;
			}
		}
		return res;
	}

	/**
	 * 最小カット<br>
	 * limitなしのflow(s, t)をちょうど1回読んだ後に呼ぶ。<br>
	 * O(n + m)
	 * 
	 * @param s 始点（0≦s＜n）
	 * @return true：始点から到達可能な頂点
	 */
	boolean[] minCut(int s) {
		assert 0 <= s && s < n : "s=" + s;

		boolean[] visited = new boolean[n];
		Queue<Integer> que = new ArrayDeque<>();
		que.add(s);
		visited[s] = true;
		while (!que.isEmpty()) {
			int p = que.poll();
			for (Edge2 e : g.get(p)) {
				if (e.cap > 0 && !visited[e.to]) {
					visited[e.to] = true;
					que.add(e.to);
				}
			}
		}
		return visited;
	}
}
