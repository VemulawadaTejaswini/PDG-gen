
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class Futon {
		int type;
		Futon adj;
		
		Futon() {
			type = -1;
		}
		
		int getType() {
			return type;
		}
		
		void setType(int type) {
			this.type = type;
		}
		
		void setAdj(Futon adj) {
			this.adj = adj;
		}
	}
	
	class State {
		long key;
		int type;

		State(long key, int type) {
			this.key = key;
			this.type = type;
		}
	}
	
	long getKey(long x, long y) {
		return x * MAX + y;
	}
	
	int MAX = 1000000100;
	int HEAD = 1, FOOT = 2;
	int[] vx = {-1, 0, 1, 0};
	int[] vy = {0, -1, 0, 1};
	
	boolean ok = false;
	HashMap<Long, Futon> map = new HashMap<Long, Futon>();
	
	void bfs(int sx, int sy, int stype) {
		Queue<State> q = new LinkedList<State>();
		q.add(new State(getKey(sx, sy), stype));
		
		while (!q.isEmpty()) {
			State next = q.poll();
			Futon f = map.get(next.key);
			long x = next.key / MAX, y = next.key % MAX;
			int type = next.type;
			if (f.type == -1) {
				f.type = type;
			} else {
				if (f.type != type) {
					ok = false;		
					q.clear();
				}
				continue;
			}

			for (int d = 0; d < vx.length; d++) {
				long nx = x + vx[d], ny = y + vy[d];
				Futon adj = map.get(getKey(nx, ny));
				if (adj != null) {
					int ntype = -1;
					if (f.adj == adj) {
						ntype = (type == HEAD) ? FOOT : HEAD;
					} else {
						ntype = type;
					}
					q.add(new State(getKey(nx, ny), ntype));
				}
			}
		}
		
	}
	
	void reset(int sx, int sy) {
		Queue<Long> q = new LinkedList<Long>();
		q.add(getKey(sx, sy));
		
		while (!q.isEmpty()) {
			long next = q.poll();
			Futon f = map.get(next);
			if (f.type == -1) continue;
			
			long x = next / MAX, y = next % MAX;
			f.type = -1;

			for (int d = 0; d < vx.length; d++) {
				long nx = x + vx[d], ny = y + vy[d];
				Futon adj = map.get(getKey(nx, ny));
				if (adj != null && f.type != -1) {
					q.add(getKey(nx, ny));
				}
			}
		}
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			int[] x = new int[n];
			int[] y = new int[n];
			map.clear();
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
				char d = in.next().charAt(0);
				
				int nx = (d == 'x') ? x[i] + 1 : x[i];
				int ny = (d == 'y') ? y[i] + 1 : y[i];
				Futon f1 = new Futon(), f2 = new Futon();
				f1.setAdj(f2);
				f2.setAdj(f1);
				map.put(getKey(x[i], y[i]), f1);
				map.put(getKey(nx, ny), f2);
			}
			
			boolean res = true;
			for (int i = 0; i < n; i++) {
				if (map.get(getKey(x[i], y[i])).getType() == -1) {
					ok = true;
					bfs(x[i], y[i], HEAD);
					if (ok) continue;
					
					reset(x[i], y[i]);
					
					ok = true;
					bfs(x[i], y[i], FOOT);
					if (!ok) {
						res = false;
						break;
					}
				}
			}
			
			out.println(res ? "Yes" : "No");
			out.flush();
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