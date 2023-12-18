
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	InputStream is;

	boolean __FILE_DEBUG_FLAG__ = false;
	String __DEBUG_FILE_NAME__ = "src/2156-input.txt";

	FastScanner in;
	PrintWriter out;
	
	class State implements Comparable<State> {
		int x;
		int y;
		int t;

		State(int x, int y, int t) {
			this.x = x;
			this.y = y;
			this.t = t;
		}

		public int compareTo(State s) {
			return dist[y][x] - dist[s.y][s.x];
		}

		public String toString() {
			return getClass().getName() + " : " + x + " " + y + " " + t;
		}
	}
	
	int NOT_YET = -1;
	int INF = 100000000;
	int[] vx = {-1, 0, 1, 0};
	int[] vy = {0, -1, 0, 1};
	
	int passedTime = 0;
	long res = 0;
	
	int[][] dist, prev;
	int[][] prevVisitTime;
	int[][] unitCost, onCost, offCost;
	char[][] room;
	
	boolean inside(int x, int y, int M, int N) {
		return x >= 0 && y >= 0 && x < M && y < N;
	}
	
	void bfs(int sx, int sy) {
		int R = dist.length, C = dist[0].length;
		for (int i = 0; i < R; i++) {
			Arrays.fill(dist[i], INF);
			Arrays.fill(prev[i], -1);
		}
		
		dist[sy][sx] = 0;
		
		Queue<State> q = new LinkedList<State>();
		q.add(new State(sx, sy, passedTime));
		while (!q.isEmpty()) {
			State st = q.poll();
			
			for (int d = 0; d < vx.length; d++) {
				int nx = st.x + vx[d], ny = st.y + vy[d];
				if (inside(nx, ny, C, R) && room[ny][nx] == '.') {
					int ncost = dist[st.y][st.x] + onCost[ny][nx] + offCost[ny][nx];
					if (prevVisitTime[ny][nx] != -1) 
						ncost = Math.min(ncost, dist[st.y][st.x] + unitCost[ny][nx] * (st.t + 1 - prevVisitTime[ny][nx]));
					
					if (ncost < dist[ny][nx]) {
						dist[ny][nx] = ncost;
						prev[ny][nx] = (d + 2) % 4;
						q.add(new State(nx, ny, st.t + 1));
					}
				}
			}
		}
		
//		mapDebug(dist);
//		mapDebug(prev);
	}
	
	void updateTime(int x, int y, int gx, int gy) {
//		System.out.println("upd : " + x + " " + y + " " + gx + " " + gy);
		if (x == gx && y == gy) return;
		
		int d = prev[y][x];
		updateTime(x + vx[d], y + vy[d], gx, gy);
		
		passedTime++;
		prevVisitTime[y][x] = passedTime;
	}
	
	public void solve() {	
		int R = in.nextInt(), C = in.nextInt(), M = in.nextInt();
		room = new char[R][];
		for (int i = 0; i < R; i++) {
			room[i] = in.next().toCharArray();
		}
		unitCost = in.nextIntMap(R, C);
		onCost = in.nextIntMap(R, C);
		offCost = in.nextIntMap(R, C);
		
		prevVisitTime = new int[R][C];
		for (int i = 0; i < R; i++) {
			Arrays.fill(prevVisitTime[i], NOT_YET);
		}
		dist = new int[R][C];
		prev = new int[R][C];
		
		int y = in.nextInt(), x = in.nextInt();
		res += onCost[y][x] + offCost[y][x];
		prevVisitTime[y][x] = 0;
		
		for (int i = 1; i < M; i++) {
			int ny = in.nextInt(), nx = in.nextInt();
			
			bfs(x, y);
			updateTime(nx, ny, x, y);
			res += dist[ny][nx];
			
			x = nx;
			y = ny;
		}
		
		System.out.println(res);
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