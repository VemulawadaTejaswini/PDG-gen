import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;

// aoj GRL_1_C FloydWarshall O(V^3)
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int v = sc.nextInt();
		int e = sc.nextInt();

		FloydWarshall fw = new FloydWarshall(v);
		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			fw.addEdge(s, t, d);
		}

		out:
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				long tmp = fw.getShortestPath(i, j);
				if (tmp == -fw.INF) {
					pr.println("NEGATIVE CYCLE");
					break out;
				} else if (tmp == fw.INF) {
					pr.print("INF");
				} else {
					pr.print(tmp);
				}
				
				if (j < v - 1) {
					pr.print(" ");
				} else {
					pr.println();
				}
			}
		}

		pr.close();
		sc.close();
	}
	
	private static class FloydWarshall {
		long[][] d;
		int n;
		long[][] result;
		boolean nf; // NEGATIVE CYCLE flag

		final long INF = Long.MAX_VALUE;

		FloydWarshall(int n) {
			this.n = n;
			d = new long[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], INF);
				d[i][i] = 0;
			}
			nf = false;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			d[i][j] = c;
		}

		public long getShortestPath(int i, int j) {
			if (nf) {
				return -INF;
			}

			if (result == null) {
				for (int kk = 0; kk < n; kk++) {
					for (int ii = 0; ii < n; ii++) {
						for (int jj = 0; jj < n; jj++) {
//							d[ii][jj] = Math.min(d[ii][jj], d[ii][kk] + d[kk][jj]);
							if (d[ii][kk] != INF && d[kk][jj] != INF && d[ii][jj] > d[ii][kk] + d[kk][jj]) {
								d[ii][jj] = d[ii][kk] + d[kk][jj];
							}
						}
					}
				}
				
				for (int k = 0; k < n; k++) {
					if (d[k][k] < 0) {
						nf = true;
						return -INF;
					}
				}
				
				result = d;
			}
			
			return result[i][j];
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