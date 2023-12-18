import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main_ALDS1_11_D {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int m = sc.nextInt();

		UnionFind uf = new UnionFind(n);

		for (int i = 0; i < m; i++) {
			uf.union(sc.nextInt(), sc.nextInt());
		}
			
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			if (uf.same(sc.nextInt(), sc.nextInt())) {
				pr.println("yes");
			} else {
				pr.println("no");
			}
		}

		pr.close();
		sc.close();
	}
		
	@SuppressWarnings("unused")
	private static class UnionFind {
		int[] parent;
		int[] rank;

		UnionFind(int n) {
			parent = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}
			
		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}
			
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
			
		void union(int x, int y) {
			x = find(x);
			y = find(y);
			if (x != y) {
				if (rank[x] > rank[y]) {
					parent[y] = x;
				} else {
					parent[x] = y;
					if (rank[x] == rank[y]) {
						rank[y]++;
					}
				}
			}

			return;
		}

		// ??°?????????????????°
		int count() {
			int ret = 0;
			for (int i = 0; i < parent.length; i++) {
				if (find(i) == i) {
					ret++;
				}
			}
				
			return ret;
		}
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		StreamTokenizer st;
			
		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StreamTokenizer(br);
		}

		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
					throw new InputMismatchException();
				}

				return st.sval;

			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}

				return (int)st.nval;

			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		long nextLong() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}

				return (long)st.nval;

			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		float nextFloat() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}

				return (float)st.nval;

			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		double nextDouble() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}

				return st.nval;

			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
				//					throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}