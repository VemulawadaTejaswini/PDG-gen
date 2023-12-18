
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	public void run() {
		while (true) {
			int M = in.nextInt(), T = in.nextInt(), P = in.nextInt(), R = in.nextInt();
			if ((M|T|P|R) == 0) break;
	
			int[] solved = new int[T+1];
			int[] penalty = new int[T+1];
			int[][] missCount = new int[T+1][P+1];
			
			for (int i = 0; i < R; i++) {
				int m = in.nextInt(), t = in.nextInt(), p = in.nextInt(), j = in.nextInt();
				if (j == 0) {
					solved[t]++;
					penalty[t] += (missCount[t][p] * 20) + m;
				} else {
					missCount[t][p]++;
				}
			}
			
			boolean[] used = new boolean[T+1];
			int beforeSolved = -1, beforePenalty = 1000000;
			for (int i = 1; i <= T; i++) {
				int nextTeam = -1;
				int maxSolved = -1, minPenalty = 10000000;
				for (int j = 1; j <= T; j++) {
					if (used[j]) continue;
					if (maxSolved < solved[j] || (maxSolved == solved[j] && minPenalty >= penalty[j])) {
						nextTeam = j;
						maxSolved = solved[j];
						minPenalty = penalty[j];
					}
				}
				if (i != 1)
					if (minPenalty == beforePenalty && maxSolved == beforeSolved) {
						System.out.print("=");
					} else {
						System.out.print(",");
					}
				System.out.print(nextTeam);
				beforeSolved = maxSolved;
				beforePenalty = minPenalty;
				used[nextTeam] = true;
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
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