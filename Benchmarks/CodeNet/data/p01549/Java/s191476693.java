
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Stack;

public class Main {
	InputStream is;

	boolean __FILE_DEBUG_FLAG__ = false;
	String __DEBUG_FILE_NAME__ = "src/T2";

	FastScanner in;
	PrintWriter out;
	
	boolean ans = true;
	
	class Elem {
		boolean[] can = new boolean[256];

		Elem() { }
		
		Elem(int lower, int upper) {
			for (int i = lower; i <= upper; i++) {
				can[i%256] = true;
			}
		}
		
		void set(int x) {
			can[x%256] = true;
		}

		Elem add(Elem e) {
			Elem res = new Elem();
			for (int i = 0; i < 256; i++) {
				if (!can[i]) continue;
				for (int j = 0; j < 256; j++) {
					if (!e.can[j]) continue;
					res.set(i+j);
				}
			}
			return res;
		}
		
		Elem sub(Elem e) {
			Elem res = new Elem();
			for (int i = 0; i < 256; i++) {
				if (!can[i]) continue;
				for (int j = 0; j < 256; j++) {
					if (!e.can[j]) continue;
					res.set(i-j+256);
				}
			}
			return res;
		}

		Elem mult(Elem e) {
			Elem res = new Elem();
			for (int i = 0; i < 256; i++) {
				if (!can[i]) continue;
				for (int j = 0; j < 256; j++) {
					if (!e.can[j]) continue;
					can[(i*j) % 256] = true;
					res.set(i*j);
				}
			}
			return res;
		}

		Elem div(Elem e) {
			Elem res = new Elem();
			for (int i = 0; i < 256; i++) {
				if (!can[i]) continue;
				for (int j = 0; j < 256; j++) {
					if (!e.can[j]) continue;
					if (j == 0) {
						ans = false; 
					} else {
						res.set(i/j);
					}
				}
			}
			return res;
		}
	}
	
	public void solve() {	
		int n = in.nextInt();
		HashMap<String, Elem> map = new HashMap<String, Elem>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int lower = in.nextInt(), upper = in.nextInt();
			map.put(name, new Elem(lower, upper));
		}
		
		int m = in.nextInt();
		Stack<Elem> stack = new Stack<Elem>();
		for (int i = 0; i < m; i++) {
			String next = in.next();
			char c = next.charAt(0);
			if (c == '+') {
				Elem e1 = stack.pop();
				Elem e2 = stack.pop();
				stack.push(e2.add(e1));
			} else if (c == '-') {
				Elem e1 = stack.pop();
				Elem e2 = stack.pop();
				stack.push(e2.sub(e1));				
			} else if (c == '*') {
				Elem e1 = stack.pop();
				Elem e2 = stack.pop();
				stack.push(e2.mult(e1));				
			} else if (c == '/') {
				Elem e1 = stack.pop();
				Elem e2 = stack.pop();
				stack.push(e2.div(e1));
				if (!ans) break;
			} else if (Character.isDigit(c)) {
				int val = Integer.valueOf(next);
				stack.push(new Elem(val, val));
			} else if (Character.isAlphabetic(c)) {
				stack.push(map.get(next));
			}
		}
		
		System.out.println(ans ? "correct" : "error");
	}

	
	public void run() {
		if (__FILE_DEBUG_FLAG__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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