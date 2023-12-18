import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void solver() {
		int V = ni();
		int E = ni();
		int K = ni();

		ArrayList<Edge>[] g = new ArrayList[V];
		for (int i = 0; i < V; ++i)
			g[i] = new ArrayList<>();

		for (int i = 0; i < E; ++i) {
			int src = ni();
			int dst = ni();
			int c = ni();
			g[src].add(new Edge(src, dst, c));
		}

		int[][][] score = new int[20][V][V];

		for (ArrayList<Edge> lis : g) {
			for (Edge e : lis) {
				score[0][e.src][e.dst] = Math.max(score[0][e.src][e.dst], e.c);
			}
		}

		// 21*150*150*150=7*10^7
		for (int i = 1; i < 20; ++i) {
			for (int from = 0; from < V; ++from) {
				for (int to = 0; to < V; ++to) {
					for (int med = 0; med < V; ++med) {
						if (score[i - 1][from][med] == 0 || score[i - 1][med][to] == 0)
							continue;
						score[i][from][to] = Math.max(score[i][from][to],
								score[i - 1][from][med] + score[i - 1][med][to]);
					}
				}
			}
		}

		// 150*20*150=
		int ans = (1 << 30);

		int[] cur = new int[V];
		int sum = 0;
		boolean ok = false;
		// src->med:cur
		// med->dst:score
		outer: for (int i = 19; i >= 0; --i) {
			for (int dst = 0; dst < V; ++dst) {
				for (int med = 0; med < V; ++med) {
					if (sum != 0 && score[i][med][dst] == 0)
						continue;
					if (cur[med] + score[i][med][dst] >= K) {
						ok = true;
						continue outer;
					}
				}
			}

			int[] next = new int[V];
			for (int dst = 0; dst < V; ++dst) {
				for (int med = 0; med < V; ++med) {
					if (sum != 0 && score[i][med][dst] == 0)
						continue;
					next[dst] = Math.max(next[dst], cur[med] + score[i][med][dst]);
				}
			}

			cur = Arrays.copyOf(next, V);

			sum += 1 << i;
		}

		if (ok) {
			ans = Math.min(ans, sum);
		}

		if (ans != 1 << 30) {
			System.out.println(++ans);
			if (ans <= 100) {

				int[][] track = new int[ans][V];// [v][k]k?????§v?????°???????????¨????????´????????????
				int[][] max = new int[ans][V];// [v][k]
				for (int i = 0; i < ans; i++) {
					for (ArrayList<Edge> lis : g) {
						for (Edge e : lis) {

							int nc = e.c;
							if (i != 0) {
								if (max[i - 1][e.src] == 0)
									continue;
								nc += max[i - 1][e.src];
							}

							if (max[i][e.dst] < nc) {
								track[i][e.dst] = e.src;
								max[i][e.dst] = nc;
							}

						}
					}
				}

				int m = 0;
				int v = -1;
				for (int i = 0; i < V; ++i) {
					if (max[ans - 1][i] > m) {
						m = max[ans - 1][i];
						v = i;
					}
				}

				ArrayDeque<Integer> stack = new ArrayDeque<>();
				stack.addFirst(v);
				for (int i = ans - 1; i >= 0; --i) {
					stack.addFirst(track[i][v]);
					v = track[i][v];
				}

				for (int i = 0; i <= ans; i++) {
					System.out.print(stack.pollFirst() + (i != ans ? " " : "\n"));
				}
			}
		} else
			System.out.println(-1);
	}

	class Edge {
		int src;
		int dst;
		int c;

		public Edge(int src, int dst, int c) {
			this.src = src;
			this.dst = dst;
			this.c = c;
		}

	}

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

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}