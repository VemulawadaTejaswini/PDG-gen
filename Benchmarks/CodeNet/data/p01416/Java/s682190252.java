import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char map[][] = new char[h][];

		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}

		int mask[][] = new int[h][w];
		int max = 0;

		int y[] = new int[h];
		int t[] = new int[w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '.') {
					mask[i][j] = 0;
				} else {
					mask[i][j] = 1 << (map[i][j] - 'A');
					max = Math.max(map[i][j] - 'A', max);
				}
				y[i] |= mask[i][j];
				t[j] |= mask[i][j];
			}
		}
		max += 1;
		boolean dp[] = new boolean[1 << max];
		dp[0] = true;
		int n = max;
		int mk = 0;

		int nnt[] = new int[n];
		int nnt2[] = new int[n];
		int nny[] = new int[n];
		int nny2[] = new int[n];

		int memo[] = new int[n];
		Arrays.fill(memo, -1);
		int memo2[] = new int[n];
		Arrays.fill(memo, -1);

		for (int j = 0; j < n; j++) {
			int shj = 1 << j;

			int nt = -1;
			int nt2 = -1;
			int ny = -1;
			int ny2 = -1;
			for (int ii = 0; ii < h; ii++) {
				if ((y[ii] & shj) != 0) {
					if (nt == -1) {
						nt = ii;
					} else {
						nt2 = ii;
					}
				}
			}
			for (int ii = 0; ii < w; ii++) {
				if ((t[ii] & shj) != 0) {
					if (ny == -1) {
						ny = ii;
					} else {
						ny2 = ii;
					}
				}
			}
			if (nt2 == -1) {
				nt2 = nt;
			}
			if (ny2 == -1) {
				ny2 = ny;
			}

			if ((nt & ny) == -1) {
				nnt[j] = nt;
				nnt2[j] = nt2;
				nny[j] = ny;
				nny2[j] = ny2;
				continue;
			}

			if (mask[nt][ny] == shj) {
				int temp = ny2;
				ny2 = ny;
				ny = temp;
			}

			nnt[j] = nt;
			nnt2[j] = nt2;
			nny[j] = ny;
			nny2[j] = ny2;

			int tf = 0;
			int tf2 = 0;
			for (int ii = Math.min(nt, nt2); ii <= Math.max(nt, nt2); ii++) {
				tf |= mask[ii][ny];
				tf2 |= mask[ii][ny2];
			}

			int yf = 0;
			int yf2 = 0;
			for (int ii = Math.min(ny, ny2); ii <= Math.max(ny, ny2); ii++) {
				yf |= mask[nt][ii];
				yf2 |= mask[nt2][ii];

			}

			memo[j] = tf | yf;
			memo2[j] = tf2 | yf2;

		}

		int i = 0;
		for (;;) {
			int previ = i;			
			for (int j = 0; j < n; j++) {
				int shj = 1 << j;
				if (dp[i | shj]) {
					// System.out.println("here");
					continue;
				}

				int nt = nnt[j];
				int nt2 = nnt2[j];
				int ny = nny[j];
				int ny2 = nny2[j];

				if ((nt & ny) == -1) {
					continue;
				}
				if (Math.abs(nt - nt2) + Math.abs(ny2 - ny) < 2) {
					continue;
				}

				if (((~(i | shj)) & (memo[j])) == 0
						|| ((~(i | shj)) & (memo2[j])) == 0) {
					dp[i | shj] = true;
					i |= shj;
				}
			}
			if(i==previ){
				break;
				
			}
		}
		System.out.println(Integer.bitCount(i)*2);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}