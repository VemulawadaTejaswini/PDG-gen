
import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

import org.omg.PortableServer.POAManagerPackage.State;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			if ((C | R) == 0) break;
			int D = sc.nextInt();
			
			int[][] signals = new int[R][C];
			boolean[][][][] cannot = new boolean[R][C][R][C];
			int[][][][] jam = new int[R][C][R][C];
			
			int ns = sc.nextInt();
			for (int i = 0; i < ns; i++) {
				int[] rc = par(sc.next());
				int k = sc.nextInt();
				signals[rc[0]][rc[1]] = k;
			}
			
			int nc = sc.nextInt();
			for (int i = 0; i < nc; i++) {
				int[] rcf = par(sc.next());
				int[] rct = par(sc.next());
				cannot[rcf[0]][rcf[1]][rct[0]][rct[1]] = true;
				cannot[rct[0]][rct[1]][rcf[0]][rcf[1]] = true;
			}
			
			int nj = sc.nextInt();
			for (int i = 0; i < nj; i++) {
				int[] rcf = par(sc.next());
				int[] rct = par(sc.next());
				int d = sc.nextInt();
				jam[rcf[0]][rcf[1]][rct[0]][rct[1]] = d;
				jam[rct[0]][rct[1]][rcf[0]][rcf[1]] = d;
			}
			int[] start = par(sc.next());
			int[] goal = par(sc.next());
			
			// dir = 向いている方向, 0->, 1^, 2<-, 3v 
			boolean[][][][] possible = new boolean[R][C][102][4];
			possible[start[0]][start[1]][0][0] = true;
			
			int[] dr = {0, -1, 0, 1};
			int[] dc = {1, 0, -1, 0};
			
			for (int k = 0; k <= 100; k++) for (int d = 0; d < 4; d++) for (int r1 = 0; r1 < R; r1++) for (int c1 = 0; c1 < C; c1++) 
			if (possible[r1][c1][k][d])
			{
				for (int nd = 0; nd < 4; nd++) if (Math.abs(d - nd) != 2) {
					int r2 = r1 + dr[nd];
					int c2 = c1 + dc[nd];
					if (0 <= r2 && r2 < R && 0 <= c2 && c2 < C && !cannot[r1][c1][r2][c2]) {
						int nk = k + D + jam[r1][c1][r2][c2];
						if (nk > 101) nk = 101;
						if (signals[r2][c2] > 0) {
							int which = (nk / signals[r2][c2]) % 2;
							if ((which == 0 && (nd == 1 || nd == 3)) ||
								(which == 1 && (nd == 0 || nd == 2))) { //ok
								;
							} else {
								nk = 101;
							}
						}
						possible[r2][c2][nk][nd] = true;
					}
				}
			}
			
			int ans = 101;
			outer:
			for (int k = 0; k <= 100; k++) for (int d = 0; d < 4; d++)
				if (possible[goal[0]][goal[1]][k][d]) 
				{
					ans = k;
					break outer;
				}
			System.out.println(ans);
		}
	}
	
	int[] par(String s) {
		String[] ss = s.split("-");
		int r = (int)(ss[0].charAt(0) - 'a');
		int c = Integer.parseInt(ss[1]) - 1;
		return new int[]{r, c};
	}
}