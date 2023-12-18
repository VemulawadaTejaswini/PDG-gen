import java.io.*;
import java.util.*;

// AOJ GRL_6_A Maximum Flow
public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int v = sc.nextInt();
		int e = sc.nextInt();

		Dinic di = new Dinic(v);

		for (int i = 0; i < e; i++) {
			int uu = sc.nextInt();
			int vv = sc.nextInt();
			int cc = sc.nextInt();

			di.addEdge(uu, vv, cc);
		}

		pr.println(di.getMaxflow(0, v - 1));
	}

	// O(EV^2)?
	private static class Dinic {
		private static final int INF = Integer.MAX_VALUE;
		List<List<Edge>> edges;
		int[] checkedTo;
		int[] level;
		int n;

		Dinic(int n) {
			this.n = n;
			edges = new ArrayList<>(n);
			for (int ii = 0; ii < n; ii++) {
				edges.add(new ArrayList<>());
			}
			checkedTo = new int[this.n];
			level = new int[this.n];
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges.get(i).add(new Edge(j, c, edges.get(j).size(), false));
			// add reverse edge
			edges.get(j).add(new Edge(i, c, edges.get(i).size() - 1, true));
		}

		public int getMaxflow(int s, int t) {
			// initialize flow
			for (int i = 0; i < n; i++) {
				for (Edge e : edges.get(i)) {
					if (!e.revFlag) {
						e.f = 0;
					} else {
						e.f = e.w;
					}
				}
			}

			int ret = 0;
			while (true) {
				Arrays.fill(level, -1);
				bfs(s);
				if (level[t] == -1) {
					break;
				}

				Arrays.fill(checkedTo, 0);
				int augmentation;
				while ((augmentation = dfs(s, t, INF)) > 0) {
					ret += augmentation;
				}
			}

			return ret;
		}

		// no capacity edges must be removed
		private void bfs(int s) {
			Queue<Integer> q = new ArrayDeque<Integer>();
			level[s] = 0;
			q.add(s);
			while (!q.isEmpty()) {
				int u = q.remove();
				for (Edge e : edges.get(u)) {
					if (level[e.v] == -1 && e.w - e.f > 0) {
						level[e.v] = level[u] + 1;
						q.add(e.v);
					}
				}
			}
		}

		// find max flow (less than f), on u -> v path
		// next vertex must has larger level
		private int dfs(int u, int v, int f) {
			if (u == v) {
				return f;
			}

			for (; checkedTo[u] < edges.get(u).size(); checkedTo[u]++) {
				Edge e = edges.get(u).get(checkedTo[u]);
				if (level[e.v] > level[u] && e.w - e.f > 0) {
					int a = dfs(e.v, v, Math.min(f, e.w - e.f));
					if (a != 0) {
						e.f += a;
						edges.get(e.v).get(e.revIndex).f -= a;

						return a;
					}
				}
			}

			return 0;
		}

		private static class Edge {
//			int u; // from
			int v; // to
			int w; // cost
			int f; // flow
			int revIndex; // index of reverse edge
			boolean revFlag; // flag of reverse edge

			Edge(int v, int w, int re, boolean f) {
//				this.u = u;
				this.v = v;
				this.w = w;
				this.f = 0;
				this.revIndex = re;
				this.revFlag = f;
			}
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}

