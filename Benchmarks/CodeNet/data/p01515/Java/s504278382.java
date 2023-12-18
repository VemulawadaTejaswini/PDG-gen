
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	String s;
	int idx;
	
	boolean parse(int next) {
		char c = s.charAt(idx++);
		switch (c) {
		case 'T': return true;
		case 'F': return false;
		case '-':
			return !parse(next);
		case '(':
			boolean b1 = parse(next);
			char c2 = s.charAt(idx++);
			boolean b2;
			switch (c2) {
			case '*':
				b2 = parse(next);
				idx++;
				return b1 && b2;
			case '+':
				b2 = parse(next);
				idx++;
				return b1 || b2;
			case '-':
				idx++;
				b2 = parse(next);
				idx++;
				return !b1 || b2;
			}
		default:
			if ((next >> (c - 'a') & 1) == 0) 
				return true;
			else
				return false;
		}
	}
	
	public void run() {
		loop : while (true) {
			s = in.next();
			idx = 0;
			if (s.matches("#")) break;
			
			for (int i = 0; i < (1 << 10); i++) {
				idx = 0;
				boolean b1 = parse(i);
				idx++;
				boolean b2 = parse(i);
				if (b1 != b2) {
					System.out.println("NO");
					continue loop;
				}
			}
			System.out.println("YES");
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