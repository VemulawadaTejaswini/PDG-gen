
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int[][][] edge;
	int[][][] dist;
	int[][] cost = new int[21][20001];
	int[][] e;
	
	int INF = 100000000;
		
	public void run() {
		while (true) {
			int N = in.nextInt(), M = in.nextInt(), C = in.nextInt(), S = in.nextInt(), G = in.nextInt();
			if (N == 0) break;
			
			edge = new int[C+1][N][N];
			
			for (int i = 0; i < edge.length; i++) {
				for (int j = 0; j < edge[i].length; j++) 	
					Arrays.fill(edge[i][j], INF);
			}
			
			for (int i = 0; i < M; i++) {
				int x = in.nextInt() - 1, y = in.nextInt() - 1, d = in.nextInt(), cc = in.nextInt();
				edge[cc][x][y] = edge[cc][y][x] = Math.min(edge[cc][x][y], d);
			}
			
			for (int c = 1; c <= C; c++) {
				for (int k = 0; k < N; k++) for (int i = 0; i < N; i++) for (int j = 0; j < N; j++)
					edge[c][i][j] = Math.min(edge[c][i][j], edge[c][i][k] + edge[c][k][j]);
			}
			
			for (int i = 0; i < cost.length; i++) {
				Arrays.fill(cost[i], 0);
			}
			
			int[] p = new int[C];
			for (int i = 0; i < p.length; i++) {
				p[i] = in.nextInt();
			}
			
			for (int i = 0; i < C; i++) {
				int[] q = new int[p[i] - 1], r = new int[p[i]];
				for (int j = 0; j < p[i] - 1; j++) {
					q[j] = in.nextInt();
				}
				for (int j = 0; j < p[i]; j++) {
					r[j] = in.nextInt();
				}
				
				int idx = 0;
				for (int j = 1; j < cost[i].length; j++) {
					cost[i+1][j] = cost[i+1][j-1] + r[idx];
					if (idx < p[i] - 1 && q[idx] == j) idx++;
				}
			}
			
			e = new int[N][N];
			
			for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) {
				e[i][j] = INF;
				for (int c = 1; c <= C; c++) {
					if (edge[c][i][j] != INF)
						e[i][j] = Math.min(e[i][j], cost[c][edge[c][i][j]]);
				}
			}
			
			int res = new Dijkstra(e).doit(S-1).minCost[G-1];
			System.out.println(res == INF ? -1 : res);
		}
		out.close();
	}

	/* -----------Dijkstra---------- */
	public class Dijkstra {
		protected final static int INF = 1000000000;
		
		class State implements Comparable<State> {
			int n;
			
			State(int n) {
				this.n = n;
			}

			public int compareTo(State s) {
				int c1 = res.minCost[n], c2 = res.minCost[s.n];
				if (c1 < c2) return -1;
				else if (c1 > c2) return 1;
				else return 0;
			}
		}
		
		DijkstraResult res;
		int[][] edge;
		
		Dijkstra(int[][] edge) {
			this.edge = edge;
		}
		
		DijkstraResult doit(int start) {
			int n = edge.length;
			res = new DijkstraResult(n);
			Arrays.fill(res.minCost, Dijkstra.INF);
			
			PriorityQueue<State> pq = new PriorityQueue<State>();
			pq.add(new State(start));
			res.minCost[start] = 0;
			res.path[start] = start;
			
			while (!pq.isEmpty()) {
				State s = pq.poll();
				for (int i = 0; i < n; i++) {
					if (res.minCost[i] > res.minCost[s.n] + edge[s.n][i]) {
						res.minCost[i] = res.minCost[s.n] + edge[s.n][i];
						res.path[i] = s.n;
						pq.add(new State(i));
					}
				}
			}
			
			return res;
		}
	}

	/**
	 * it contains minCost and path from start node to each nodes.
	 * @author hiro116s
	 *
	 */
	class DijkstraResult {
		int[] minCost;
		int[] path;
		
		DijkstraResult(int n) {
			minCost = new int[n];
			path = new int[n];
		}
	}
	
	/*-------------end--------------*/
	
	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}