
import static java.util.Arrays.deepToString;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

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
			solve();
		}
	}
	
	
	int[] dr = {0, 1, 0, -1, 0, 1};
	int[] dc = {1, 0, -1, 0, 1, 0};
	int[][] t;
	int R, C;
	boolean can(int r, int c) {
		return 0 <= r && r < R && 0 <= c && c < C && t[r][c] == 0;
	}
	int[][][][] memo = new int[50][50][50][50];
	void solve() {
		C = sc.nextInt();
		R = sc.nextInt();
		if (R == 0 && C == 0) return;
		int c1 = sc.nextInt()-1;
		int r1 = sc.nextInt()-1;
		int c2 = sc.nextInt()-1;
		int r2 = sc.nextInt()-1;
		t = new int[R][C];
		for (int i = 0; i < R; i++) for (int j = 0; j < C; j++) t[i][j] = sc.nextInt();
		for (int i = 0; i < R; i++) for (int j = 0; j < C; j++)
			for (int ii = 0; ii < R; ii++) for (int jj = 0; jj < C; jj++)
				memo[i][j][ii][jj] = 99999999;
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(e(r1, c1, r2, c2));
		memo[r1][c1][r2][c2] = 0;
		int ans = -1;
		while (!q.isEmpty()) {
			int k = q.poll();
			c2 = k % 50; k /= 50;
			r2 = k % 50; k /= 50;
			c1 = k % 50; k /= 50;
			r1 = k % 50; k /= 50;
			int d = memo[r1][c1][r2][c2];
			if (d > 100) break;
			if (r1 == r2 && c1 == c2) {
				ans = d;
				break;
			}
			for (int i = 0; i < 4; i++) {
				int nr1 = r1 + dr[i];
				int nc1 = c1 + dc[i];
				int nr2 = r2 + dr[i+2];
				int nc2 = c2 + dc[i+2];
				if (!can(nr1, nc1)) { nr1 = r1; nc1 = c1; }
				if (!can(nr2, nc2)) { nr2 = r2; nc2 = c2; }
				if (memo[nr1][nc1][nr2][nc2] > d + 1) {
					memo[nr1][nc1][nr2][nc2] = d + 1;
					q.add(e(nr1, nc1, nr2, nc2));
				}
			}
		}
		if (ans == -1) System.out.println("NA"); 
		else System.out.println(ans);
		
	}
	int e(int a, int b, int c, int d) {
		int k = 0;
		k = k * 50 + a;
		k = k * 50 + b;
		k = k * 50 + c;
		k = k * 50 + d;
		return k;
	}
}