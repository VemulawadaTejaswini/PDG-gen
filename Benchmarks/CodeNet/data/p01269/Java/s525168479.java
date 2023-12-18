
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class State implements Comparable<State> {
		int L, N;
		
		State(int N, int L) {
			this.N = N;
			this.L = L;
		}

		@Override
		public int compareTo(State o) {
			int c1 = minCost[L][N], c2 = minCost[o.L][o.N];
			return c1 - c2;
		}
	}
	
	int[][] minCost;
	int[][] dEdge;
	int[][] eEdge;
	
	int INF = 100000000;
	
	PriorityQueue<State> pq;
	
	void dijkstra(int n) {
		while (!pq.isEmpty()) {
//			mapDebug(minCost);
			State s = pq.poll();
			for (int i = 0; i < n; i++) {
				if (dEdge[s.N][i] != INF && s.L - dEdge[s.N][i] >= 0) {
					if (minCost[s.L - dEdge[s.N][i]][i] > minCost[s.L][s.N]) {
						minCost[s.L - dEdge[s.N][i]][i] = minCost[s.L][s.N];
						pq.add(new State(i, s.L - dEdge[s.N][i]));
					}
				}
				if (minCost[s.L][i] > minCost[s.L][s.N] + eEdge[s.N][i]) {
					minCost[s.L][i] = minCost[s.L][s.N] + eEdge[s.N][i];
					pq.add(new State(i, s.L));
				}
			}
		}
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt(), m = in.nextInt(), l = in.nextInt();
			if (n == 0) break;
			
			dEdge = new int[n][n];
			eEdge = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(dEdge[i], INF);
				Arrays.fill(eEdge[i], INF);
			}
			
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1, b = in.nextInt() - 1, d = in.nextInt(), e = in.nextInt();
				dEdge[a][b] = dEdge[b][a] = d;
				eEdge[a][b] = eEdge[b][a] = e;
			}
			

			minCost = new int[l+1][n];
			for (int i = 0; i <= l; i++)
				Arrays.fill(minCost[i], INF);
			minCost[l][0] = 0;
			
			pq = new PriorityQueue<State>();
			pq.add(new State(0, l));
			
			dijkstra(n);
			
//			mapDebug(minCost);
			
			int res = INF;
			for (int i = 0; i <= l; i++) {
				res = Math.min(res, minCost[i][n-1]);
			}
			System.out.println(res);
		}
		out.close();
	}

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