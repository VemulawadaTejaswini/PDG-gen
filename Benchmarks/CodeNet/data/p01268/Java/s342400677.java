
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	boolean[] primeList;
	
	boolean isPrime(int n) {
		if (n < 0) return false;
		return primeList[n];
	}
	
	boolean[] getPrimeList(int n) {
		boolean[] res = new boolean[n+1];
		
		Arrays.fill(res, true);
		
		res[0] = res[1] = false;
		for (int i = 2; i < res.length; i++) {
			if (!res[i]) continue;
			for (int j = 2 * i; j < res.length; j += i) {
				res[j] = false;
			}
		}
		
		return res;
	}
	
	public void run() {
		primeList = getPrimeList(200000);
		while (true) {
			int n = in.nextInt(), m = in.nextInt();
			if (n == -1) break;
			int[] p = new int[m];
			for (int i = 0, x = n + 1; i < m; x++) {
				if (isPrime(x)) {
					p[i++] = x;
				}
			}
			
			int[] sum = new int[m*m];
			Arrays.fill(sum, Integer.MAX_VALUE);
			for (int i = 0, idx = 0; i < m; i++) {
				for (int j = i; j < m; j++) {
					int temp = p[i] + p[j];
					sum[idx++] = temp;
				}
			}
			
			Arrays.sort(sum);
			
			System.out.println(sum[m-1]);
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