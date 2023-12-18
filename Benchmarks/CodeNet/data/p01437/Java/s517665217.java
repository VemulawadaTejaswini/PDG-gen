
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	int N = 0, E = 1, S = 2, W = 3;
	String nesw = "NESW";
	int MAX = 10000;
	int[] vx = {0, 1, 0, -1};
	int[] vy = {-1, 0, 1, 0};
	
	int[] xlist = new int[10010];
	int[] ylist = new int[10010];
	int[] dirlist = new int[10010];
	
	boolean inside(int x, int y, int M, int N) {
		return x >= 0 && y >= 0 && x < M && y < N;
	}
	
	long getKey(long x, long y, long dir) {
		return x * MAX * 4 + y * 4 + dir; 
	}
	
	public void run() {
		while (true) {
			int H = in.nextInt(), W = in.nextInt();
			long L = in.nextLong();
			if (H == 0) break;
			int x = -1, y = -1, dir = -1;
			char[][] c = new char[H][];
			for (int i = 0; i < H; i++) {
				c[i] = in.next().toCharArray();
				for (int j = 0; j < W; j++) {
					switch (c[i][j]) {
					case 'E' :
						x = j;
						y = i;
						dir = E;
						break;
					case 'N' :
						x = j;
						y = i;
						dir = N;
						break;
					case 'S' :
						x = j;
						y = i;
						dir = S;
						break;
					case 'W' :
						x = j;
						y = i;
						dir = W;
						break;
					}
				}
			}
			
			Arrays.fill(xlist, -1);
			Arrays.fill(ylist, -1);
			Arrays.fill(dirlist, -1);
			
			int cnt = 0;
			HashMap<Long, Integer> map = new HashMap<Long, Integer>();
			while (true && cnt < L) {
				if (map.containsKey(getKey(x, y, dir))) break;
				
				if (xlist[cnt] == -1) {
					xlist[cnt] = x;
					ylist[cnt] = y;
					dirlist[cnt] = dir;
//					System.out.println(cnt + " : " + (y+1) + " " + (x+1) + " " + nesw.charAt(dir));
				}
				map.put(getKey(x, y, dir), cnt++);
				int nx = x + vx[dir], ny = y + vy[dir];
				if (!inside(nx, ny, W, H) || (inside(nx, ny, W, H) && c[ny][nx] == '#')) {
					nx = x;
					ny = y;
					dir = (dir + 1) % 4;
					cnt--;
				}
				
				x = nx;
				y = ny;
			}
			
			if (cnt != L) {
				long max = cnt, min = map.get(getKey(x, y, dir));
				int key = (max == min) ? (int) min : (int) ((L - min) % (max - min) + min);
				
				x = xlist[key];
				y = ylist[key];
				dir = dirlist[key];
			}		
			System.out.println((y+1) + " " + (x+1) + " " + nesw.charAt(dir));
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