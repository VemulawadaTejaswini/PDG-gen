import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	// AOJ GRL_3_C Strongly Connected Componets(強連結成分分解)
	private static void solve() {
		int v = sc.nextInt();
		int e = sc.nextInt();

		SCC scc = new SCC(v);

		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();

			scc.add_edge(s, t);
		}

		scc.scc();

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int uu = sc.nextInt();
			int vv = sc.nextInt();

			if (scc.getCmp(uu) == scc.getCmp(vv)) {
				pr.println(1);
			} else {
				pr.println(0);
			}
		}
	}

	// SCC O(V + E)
	private static class SCC {
		private int V;
		private List<List<Integer>> edges;
		private List<List<Integer>> redges;  // 逆向きの辺
		private List<Integer> vs;  // 帰りがけ順の並び
		private int[] used;  // 0:White, 1:Gray, 2:Black
		private int[] cmp;  // 属する強連結成分のトポロジカル順序

		private SCC(int V) {
			this.V = V;

			edges = new ArrayList<>(V);
			redges = new ArrayList<>(V);
			for (int i = 0; i < V; i++) {
				edges.add(new ArrayList<>());
				redges.add(new ArrayList<>());
			}
			vs = new ArrayList<>(V);
			used = new int[V];
			cmp = new int[V];
		}

		private void add_edge(int from, int to) {
			edges.get(from).add(to);
			redges.get(to).add(from);
		}

		private int scc() {
			// dfs
			for (int v = 0; v < V; v++) {
				if (used[v] != 0) {
					continue;
				}

				Deque<Integer> st = new ArrayDeque<>();
				st.push(v);
				while (!st.isEmpty()) {
					int e = st.peek();

					if (used[e] == 2) {
						st.pop();
					} else if (used[e] == 1) {
						// postorder
						vs.add(e);
						used[e] = 2;
						st.pop();
					} else {
						// preorder
						used[e] = 1;
						for (int next : edges.get(e)) {
							if (used[next] == 2) {
								// 前進辺または横断辺
								continue;
							} else if (used[next] == 1) {
								// 後退辺
								continue;
							}

							st.push(next);
						}
					}
				}
			}

			Arrays.fill(used, 0);

			// rdfs
			int k = 0;
			for (int i = vs.size() - 1; i >= 0; i--) {
				int v = vs.get(i);

				if (used[v] != 0) {
					continue;
				}

				Deque<Integer> st = new ArrayDeque<>();
				st.push(v);
				while (!st.isEmpty()) {
					int e = st.peek();

					if (used[e] == 2) {
						st.pop();
					} else if (used[e] == 1) {
						// postorder
						used[e] = 2;
						st.pop();
					} else {
						// preorder
						cmp[e] = k;
						used[e] = 1;
						for (int next : redges.get(e)) {
							if (used[next] == 2) {
								// 前進辺または横断辺
								continue;
							} else if (used[next] == 1) {
								// 後退辺
								continue;
							}

							st.push(next);
						}
					}
				}

				k++;
			}

			return k;
		}

		// v が属する強連結成分のトポロジカル順序
		private int getCmp(int v) {
			return cmp[v];
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

