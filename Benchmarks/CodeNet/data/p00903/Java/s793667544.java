import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
//		long cur = System.currentTimeMillis();
		new Main().run();
//		System.err.println(System.currentTimeMillis() - cur);
	}

	int[] e;
	int n;
	int[] shrink;
	int[][][] cost;

	@SuppressWarnings("unchecked")
	void solver() {

		while (true) {
			n = ni();
			int m = ni();
			if (n == 0 && m == 0)
				break;
			int[] d = new int[n];
			e = new int[n];
			ArrayList<Edge>[] g = new ArrayList[n];
			ArrayList<Edge>[] rev = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				g[i] = new ArrayList<>();
				rev[i] = new ArrayList<>();
			}
			shrink = new int[n];
			int[] num = new int[1001];
			num[0] = 1;
			num[1000] = 1;
			for (int i = 1; i < n - 1; i++) {
				d[i] = ni();
				e[i] = ni();
				shrink[i] = num[e[i]]++;
			}
			e[0] = 0;
			e[n - 1] = 1000;
			for (int i = 0; i < m; i++) {
				int src = ni() - 1;
				int dst = ni() - 1;
				int cost = ni();
				if (e[src] >= e[dst])
					g[src].add(new Edge(src, dst, cost));
				if (e[src] <= e[dst])
					rev[dst].add(new Edge(dst, src, cost));
			}
			boolean[][][] looked = new boolean[n][n][];
			cost = new int[n][n][];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (e[i] > e[j]) {
						cost[i][j] = new int[1 << num[e[i]]];
						looked[i][j] = new boolean[1 << num[e[i]]];
					} else {
						cost[i][j] = new int[1 << num[e[j]]];
						looked[i][j] = new boolean[1 << num[e[j]]];
					}
					Arrays.fill(cost[i][j], INF);
				}
			}
			looked[n - 1][n - 1][1] = true;
			cost[n - 1][n - 1][1] = 0;
			PriorityQueue<State> pq = new PriorityQueue<>();
			pq.add(new State(n - 1, n - 1));
			int ans = INF;
			while (!pq.isEmpty()) {
				State s = pq.poll();
				for (Edge edge : e[s.from] < e[s.to] ? g[s.to] : rev[s.from]) {
					if (e[edge.src] < e[edge.dst]) {
						continue;
					}
					State ns = s.copy();
					int ncost = cost[s.from][s.to][s.vis] + edge.cost + d[edge.dst];
					if (ns.visited(edge.dst))
						ncost -= d[edge.dst];

					if (e[s.from] < e[s.to])
						ns.setTo(edge.dst);
					else
						ns.setFrom(edge.dst);
					if (ncost < cost[ns.from][ns.to][ns.vis]) {
						cost[ns.from][ns.to][ns.vis] = ncost;
						if (ns.from == 0 && ns.to == 0)
							ans = Math.min(ans, ncost);
						else if (!looked[ns.from][ns.to][ns.vis]) {
							pq.add(ns);
							looked[ns.from][ns.to][ns.vis] = true;
						}
					}
				}
			}
			// System.out.println(Runtime.getRuntime().totalMemory() / 1000);
			out.println(ans == INF ? -1 : ans);
		}
	}

	class State implements Comparable<State> {
		int from;
		int to;
		int vis;

		public State(int from, int to) {
			vis = 0;
			this.from = from;
			this.to = to;
			if (e[from] >= e[to])
				vis |= 1 << shrink[from];
			if (e[to] >= e[from])
				vis |= 1 << shrink[to];
		}

		public State(int from, int to, int vis) {
			this.from = from;
			this.to = to;
			this.vis = vis;
		}

		void setFrom(int from) {
			if (e[from] == e[this.from]) {
				vis |= 1 << shrink[from];
			} else if (e[this.from] == e[to]) {

			} else if (e[from] > e[to]) {
				vis = 1 << shrink[from];
			} else if (e[from] == e[to]) {
				vis = 1 << shrink[from] | 1 << shrink[to];
			} else if (e[from] < e[to]) {
				vis = 1 << shrink[to];
			}
			this.from = from;
		}

		void setTo(int to) {
			if (e[to] == e[this.to]) {
				vis |= 1 << shrink[to];
			} else if (e[this.to] == e[from]) {

			} else if (e[to] > e[from]) {
				vis = 1 << shrink[to];
			} else if (e[from] == e[to]) {
				vis = 1 << shrink[from] | 1 << shrink[to];
			} else if (e[to] < e[from]) {
				vis = 1 << shrink[from];
			}
			this.to = to;
		}

		boolean visited(int k) {
			if (e[k] != e[to] && e[k] != e[from])
				return false;
			if (e[to] == e[from] || (e[k] == e[to] && e[to] > e[from]) || (e[k] == e[from] && e[from] > e[to])) {
				return ((vis >> shrink[k]) & 1) == 1;
			} else if (k == to || k == from) {
				return true;
			} else {
				return false;
			}
		}

		State copy() {
			return new State(from, to, vis);
		}

		@Override
		public int compareTo(State o) {
			int d = -Integer.compare(Math.max(e[this.from], e[this.to]), Math.max(e[o.from], e[o.to]));
			if (d != 0)
				return d;
			else {
				return Integer.compare(cost[this.from][this.to][this.vis], cost[o.from][o.to][o.vis]);
			}
		}
	}

	int INF = 1 << 30;

	class Edge {
		int src;
		int dst;
		int cost;

		Edge(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}
	}

	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver();
		out.flush();

	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

}