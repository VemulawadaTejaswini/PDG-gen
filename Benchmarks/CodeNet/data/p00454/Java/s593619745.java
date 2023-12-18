import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	int w, h;
	void run() {
		for (;;) {
			System.gc();
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) break;

			int n = sc.nextInt();

			int[] x = new int[2 * n + 2];
			int[] y = new int[2 * n + 2];
			for (int i = 0; i < n; i++) {
				x[2 * i] = sc.nextInt();
				y[2 * i] = sc.nextInt();
				x[2 * i + 1] = sc.nextInt();
				y[2 * i + 1] = sc.nextInt();
			}
			x[2 * n] = 0;
			x[2 * n + 1] = w;
			y[2 * n] = 0;
			y[2 * n + 1] = h;

			x = normalize(x);
			y = normalize(y);

			short[][] table = new short[2 * n + 10][2 * n + 10]; // 8M
			short[][] acc = new short[2 * n + 10][2 * n + 10];
			for (int i = 0; i < n; i++) {
				int x1 = x[2 * i + 0];
				int y1 = y[2 * i + 0];
				int x2 = x[2 * i + 1];
				int y2 = y[2 * i + 1];
				table[x1][y1]++;
				table[x1][y2]--;
				table[x2][y1]--;
				table[x2][y2]++;
			}

			acc[0][0] = table[0][0];
			for (int i = 1; i < table.length; i++) {
				acc[i][0] = (short) (acc[i-1][0] + table[i][0]);
				acc[0][i] = (short) (acc[0][i-1] + table[0][i]);
			}
			for (int i = 1; i < table.length; i++) {
				for (int j = 1; j < table.length; j++) {
					acc[i][j] = (short) (table[i][j] + acc[i-1][j] + acc[i][j-1] - acc[i-1][j-1]);
				}
			}

			w = x[2 * n + 1];
			h = y[2 * n + 1];

			int ans = 0;
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if (acc[i][j] == 0) {
						ans++;
						bfs((short)i, (short)j, acc);
					}
				}
			}
			System.out.println(ans);

		}
	}

	void bfs(short x, short y, short[][] acc) {

		short[] queue = new short[2000 * 2000 * 2];
		int head = 0;
		int tail = 0;
		queue[tail++] = x;
		queue[tail++] = y;
		acc[x][y] = 2;

		short[] dx = {0, -1, 0, 1};
		short[] dy = {-1, 0, 1, 0};

		while (head < tail) {
			x = queue[head++];
			y = queue[head++];

			for (int i = 0; i < 4; i++) {
				short nx = (short) (x + dx[i]);
				short ny = (short) (y + dy[i]);

				if ((0 <= nx && nx < w && 0 <= ny && ny < h) && acc[nx][ny] == 0) {
					queue[tail++] = nx;
					queue[tail++] = ny;
					acc[nx][ny] = 2;
				}

			}
		}

	}

	int[] normalize(int[] v) {
		int[] res = new int[v.length];
		long[][] t = new long[v.length][2];
		for (int i = 0; i < v.length; i++) {
			t[i][0] = v[i];
			t[i][1] = i;
		}
		Arrays.sort(t, 0, t.length, new Comparator<long[]>(){
			public int compare(long[] a, long[] b){
				if (a[0] != b[0]) return a[0] < b[0] ? -1 : 1;
				return 0;
			}
		});

		int r = 0;
		for (int i = 0; i < v.length; i++) {
			r += (i > 0 && t[i - 1][0] != t[i][0]) ? 1 : 0;
			res[(int)t[i][1]] = r;
		}
		return res;
	}


}