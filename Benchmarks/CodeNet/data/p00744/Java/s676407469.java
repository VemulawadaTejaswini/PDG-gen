import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	int maximumFlow(int resCapacity[][], int size, int s, int t) {
		int flow = 0;
		int flowMartix[][] = new int[size][size];
		int minCapacity[] = new int[size];
		int prev[] = new int[size];
		int queue[] = new int[size];
		int first, last;
		for (int i = 0; i < size; i++)
			minCapacity[i] = Integer.MAX_VALUE;
		while (true) {
			first = last = 0;
			queue[last++] = s;
			Arrays.fill(prev, -1);
			prev[s] = s;
			while (first != last && prev[t] < 0) {
				int u = queue[first++];
				for (int v = 0; v < size; v++) {
					if (prev[v] < 0 && 0 < resCapacity[u][v]) {
						prev[v] = u;
						queue[last++] = v;
						minCapacity[v] = Math.min(minCapacity[u], resCapacity[u][v]);
					}
				}
			}
			if (prev[t] < 0) return flow;
			//if (prev[t] < 0) return flowMartix;
			for (int i = t; prev[i] != i; i = prev[i]) {
				resCapacity[prev[i]][i] -= minCapacity[t];
				resCapacity[i][prev[i]] += minCapacity[t];
				flowMartix[prev[i]][i] += minCapacity[t];
				flowMartix[i][prev[i]] -= minCapacity[t];
			}
			flow += minCapacity[t];
		}
	}

	int gcd(int a,int b) {
		if(a<b){a^=b;b^=a;a^=b;}
		return b!=0?gcd(b,a%b):a;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			int[] a = sc.nextIntArray(n);
			int[] b = sc.nextIntArray(m);

			int[][] g = new int[n + m + 2][n + m + 2];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (1 < gcd(a[i], b[j])) {
						int u = i + 1;
						int v = n + j + 1;
						g[u][v] = 1;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				g[0][i + 1] = 1;
			}
			for (int j = 0; j < m; j++) {
				g[n + j + 1][n + m + 1] = 1;
			}

			System.out.println(maximumFlow(g, n + m + 2, 0, n + m + 1));
		}
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
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
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

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
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