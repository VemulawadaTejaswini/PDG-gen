
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int[] vx = {0, -1, 0, 1};
	int[] vy = {-1, 0, 1, 0};

	int[][] die = {
			{2, 3, 5, 4}, //1
			{6, 3, 1, 4}, //2
			{1, 2, 6, 5}, //3
			{1, 5, 6, 2}, //4
			{1, 3, 6, 4}, //5
			{5, 3, 2, 4}  //6
	};

	int[] culcDirList(int t, int f) {
		int[] dice = new int[4];
		dice[0] = f; dice[2] = 7 - f;
		
		for (int i = 0; i < die.length; i++) {
			for (int j = 0; j < die[i].length; j++) {
				if (die[i][j] == t && die[i][(j+1)%4] == f) {
					dice[1] = i + 1; dice[3] = 7 - i - 1;
				}
			}
		}
		int[] dir = new int[2];
		for (int i = 0; i < 2; i++) {
			int cur = 0, max = -1;
			for (int j = 0; j < 4; j++) {
				if (dice[j] > max) {
					cur = j;
					max = dice[j];
				}
			}
			dir[i] = cur;
			dice[cur] = -2;
 		}
		
		return dir;
	}
	
	int nextT(int t, int f, int d) {
		int s = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (die[i][j] == t && die[i][(j+1)%4] == f) {
					s = i + 1;
				}
			}
		}
		
		return (d == 0) ? 7 - f :
				(d == 1) ? 7 - s :
				(d == 2) ? f : s;
	}
	
	int nextF(int t, int f, int d) {
		int s = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (die[i][j] == t && die[i][(j+1)%4] == f) {
					s = i + 1;
				}
			}
		}
		
		return (d == 0) ? t :
				(d == 1) ? f :
				(d == 2) ? 7 - t : f;
	}
	
	public void run() {
		int[][][] fieldT = new int[101][201][201];
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			for (int i = 0; i < fieldT.length; i++) {
				for (int j = 0; j < fieldT[i].length; j++) {
					Arrays.fill(fieldT[i][j], -1);
				}
			}
			
			int topPos = 0;
			for (int i = 0; i < n; i++) {
				int t = in.nextInt(), f = in.nextInt();
				boolean canMove = true;
				int x = 100, y = 100, height = topPos;
				loop : while (canMove) {
					int[] dir = culcDirList(t, f);
					for (int d : dir) {
						int nx = x + vx[d], ny = y + vy[d];
						if (height > 0 && fieldT[height-1][ny][nx] == -1) {
							int tt = nextT(t, f, d), ff = nextF(t, f, d);
							t = tt; f = ff;
							x = nx; y = ny; height--;
							continue loop;
						}
					}
					canMove = false;
				}
				fieldT[height][y][x] = t;
				if (x == 100 && y == 100) topPos++;
			}
			
			int[] res = new int[6];
			for (int i = 0; i <= 200; i++) {
				for (int j = 0; j <= 200; j++) {
					for (int k = 100; k >= 0; k--) {
						if (fieldT[k][i][j] != -1) {
							res[fieldT[k][i][j]-1]++;
							break;
						}
					}
				}
			}
			
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
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