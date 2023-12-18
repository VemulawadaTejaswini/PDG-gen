
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __t__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;

	int[] vx = {-1, 0, 1, 0};
	int[] vy = {0, -1, 0, 1};
	
	int xl = 0, xr = 0;
	int W, H;
	int[] cnt = new int[50];
	boolean[][] vis;
	int[][] p;
	
	boolean inside(int x, int y, int M, int N) {
		return x >= 0 && y >= 0 && x < M && y < N;
	}
	
	void init(int y, int x, char c, int id, char[][] _p) {
		p[y][x] = id;
		vis[y][x] = true;
		
		for (int d = 0; d < vx.length; d++) {
			int nx = x + vx[d], ny = y + vy[d];
			if (inside(nx, ny, W, H) && !vis[ny][nx] && c == _p[ny][nx]) 	
				init(ny, nx, c, id, _p);
		}
	}
	
	void dfs(int y, int x) {
		vis[y][x] = true;
		cnt[x]++;
		
		for (int d = 0; d < vx.length; d++) {
			int nx = x + vx[d], ny = y + vy[d];
			if (inside(nx, ny, W, H) && !vis[ny][nx] && p[y][x] == p[ny][nx]) 
				dfs(ny, nx);
		}
		
		if (inside(x, y - 1, W, H) && !vis[y-1][x] && p[y-1][x] != -1) {
			dfs(y - 1, x);
		}
	}
	
	public void solve() {
		while (true) {
			W = in.nextInt(); 
			H = in.nextInt();
			if (W == 0) break;
			
			char[][] _p = new char[H][];
			for (int i = 0; i < H; i++) {
				_p[i] = in.next().toCharArray();
			}
			p = new int[H][W];
			vis = new boolean[H][W];
			
			for (int i = 0; i < H; i++) {
				Arrays.fill(p[i], -1);
			}
			
			int blockNum = 0;
			for (int i = 0; i < H; i++) {
				Arrays.fill(vis[i], false);
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (_p[i][j] != '.' && !vis[i][j]) {
						init(i, j, _p[i][j], blockNum++, _p);
					}
				}
			}
			
//			mapDebug(p);
			boolean res = true;
			for (int target = 0; target < blockNum; target++) {
				Arrays.fill(cnt, 0);
				for (int i = 0; i < H; i++) {
					Arrays.fill(vis[i], false);
				}
				xl = W + 10; xr = -1;
				
				int maxY = -1;
				boolean exist = false;
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (p[i][j] == target) {
							if (!exist) {
								dfs(i, j);
								exist = true;
							}
							maxY = Math.max(maxY, i);
						}
					}
				}
				if (!exist) continue;
				
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (p[i][j] == target && (i + 1 == H || (p[i+1][j] != -1 && p[i+1][j] != target))) {
							xl = Math.min(xl, j);
							xr = Math.max(xr, j + 1);
						}
					}
				}
				
				double M = 0;
				int all = 0;
				for (int i = 0; i < W; i++) {
					all += cnt[i];
					M += cnt[i] * (i + 0.5);
				}
				M = M / all;
				
				res &= (xl < M && M < xr);
			}
			System.out.println(res ? "STABLE" : "UNSTABLE");
		}
	}	
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
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
				map[i] = nextIntArray(m);
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
				map[i] = nextLongArray(m);
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
				map[i] = nextDoubleArray(m);
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