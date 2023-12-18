
import java.io.*;
import java.util.*;

import org.omg.PortableServer.POAManagerPackage.State;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int MAX = 1000000010;
	class State implements Comparable<State> {
		int id;
		int low;
		int high;

		State(int id, int low, int high) {
			this.id = id;
			this.low = low;
			this.high = high;
		}

		boolean isInside(int val) {
			return low <= val && val < high;
		}
		
		public int compareTo(State s) {
			return low - s.low;
		}

		public String toString() {
			return getClass().getName() + " : " + id + " " + low + " " + high;
		}
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			TreeSet<State> tset = new TreeSet<State>();
			tset.add(new State(-1, -1, 0));
			tset.add(new State(-1, MAX, MAX + 1));
			
			ArrayList<State> temp = new ArrayList<State>();
			for (int times = 0; times < n; times++) {
				char command = in.next().charAt(0);
				int id, S;
				switch (command) {
				case 'W' :
					id = in.nextInt();
					S = in.nextInt();
					
					int upper = -1;
					temp.clear();
					for (State st : tset) {
						if (st.low - upper > 0) {
							temp.add(new State(id, upper, Math.min(upper + S, st.low)));
							S = Math.max(S - (st.low - upper), 0);
						}
						if (S == 0) break;
						
						upper = st.high;
					}
					
					for (State st : temp) tset.add(st);
					
					break;
				case 'D' :
					id = in.nextInt();
					temp.clear();
					for (State st : tset) {
						if (st.id == id) temp.add(st);
					}
					for (State st : temp) tset.remove(st);
					break;
				case 'R' :
					int pos = in.nextInt();
					State dummy = new State(-1, pos, -1);
					State ceiling = tset.ceiling(dummy);
					State floor = tset.floor(dummy);
					if (ceiling.isInside(pos)) {
						out.println(ceiling.id);
					} else if (floor.isInside(pos)) {
						out.println(floor.id);
					} else {
						out.println(-1);
					}
					break;
				}
			}
			out.println();
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