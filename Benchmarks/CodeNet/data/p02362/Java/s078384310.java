import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// aoj GRL_1_B BellmanFord O(VE)
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int v = sc.nextInt();
		int e = sc.nextInt();
		int r = sc.nextInt();

		BellmanFord bf = new BellmanFord(v);
		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			bf.addEdge(s, t, d);
		}

		for (int i = 0; i < v; i++) {
			long tmp = bf.getShortestPath(r, i);
			if (tmp == -bf.INF) {
				pr.println("NEGATIVE CYCLE");
				break;
			} else if (tmp == bf.INF) {
				pr.println("INF");
			} else {
				pr.println(tmp);
			}
		}

		pr.close();
		sc.close();
	}

	private static class BellmanFord {
		long[] d;
		List<Edge> edges;
		int n;
		int s;

		final long INF = Long.MAX_VALUE;

		BellmanFord(int n) {
			this.n = n;
			edges = new ArrayList<Edge>();
			s = -1;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges.add(new Edge(i, j, c));
		}

		// ????????????????????° -INF ?????????
		public long getShortestPath(int i, int j) {
			if (s != i) {
				d = new long[n];
				Arrays.fill(d, INF);
				d[i] = 0;

				boolean update = false;
				for (int kk = 0; kk < n - 1; kk++) {
					update = false;
					for (int jj = 0; jj < edges.size(); jj++) {
						if (d[edges.get(jj).u] != INF && d[edges.get(jj).v] > d[edges.get(jj).u] + edges.get(jj).w) {
							d[edges.get(jj).v] = d[edges.get(jj).u] + edges.get(jj).w;
							update = true;
						}
					}
					if (!update) {
						break;
					}
				}

				// ?????????????????§??????
//				if (update) {
					for (int jj = 0; jj < edges.size(); jj++) {
						if (d[edges.get(jj).u] != INF && d[edges.get(jj).v] > d[edges.get(jj).u] + edges.get(jj).w) {
							return -INF;
						}
					}
//				}

				s = i;
			}

			return d[j];
		}

		private static class Edge {
			int u; // from
			int v; // to
			int w; // cost

			Edge(int u, int v, int w) {
				this.u = u;
				this.v = v;
				this.w = w;
			}
		}
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
					it = Arrays.asList(br.readLine().split(" ")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}