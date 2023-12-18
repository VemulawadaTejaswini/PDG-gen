import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[] dx = { 1, 0, -1, 0 };
	int[] dy = { 0, 1, 0, -1 };
	int H, W, C;
	int[][] map;
	boolean visit[][];
	int max, cnt;

	void run() {
		for (;;) {
			H = sc.nextInt();
			W = sc.nextInt();
			C = sc.nextInt();
			if ((H | W | C) == 0) {
				return;
			}
			map = new int[H][W];
			max = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			boolean[] use = new boolean[6];
			int[] parm = new int[6];
			makePerm(0, parm, use);
			System.out.println(max);
		}
	}

	void makePerm(int n, int[] parm, boolean use[]) {
		if (n == 6) {
			solve(parm);
			return;
		}
		for (int i = 1; i <= 6; i++) {
			parm[n] = i;
			makePerm(n + 1, parm, use);
		}
	}

	void solve(int parm[]) {
		int field[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				field[i][j] = map[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			visit = new boolean[H][W];
			int first = field[0][0];
			dfs(field, parm[i], first, visit, 0, 0);
		}
		visit = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (field[i][j] == C && !visit[i][j]) {
					cnt = 1;
					cntMap(field, visit, i, j);
					max = Math.max(max, cnt);
				}
			}
		}
	}

	void dfs(int[][] field, int num, int first, boolean[][] visit, int h, int w) {
		field[h][w] = num;
		visit[h][w] = true;
		for (int i = 0; i < 4; i++) {
			int nh = h + dy[i];
			int nw = w + dx[i];
			if (nh >= 0 && nh < H && nw >= 0 && nw < W && !visit[nh][nw]
					&& field[nh][nw] == first) {
				dfs(field, num, first, visit, nh, nw);
			}
		}
	}

	void cntMap(int[][] field, boolean[][] visitf, int h, int w) {
		visit[h][w] = true;
		for (int i = 0; i < 4; i++) {
			int nh = h + dy[i];
			int nw = w + dx[i];
			if (nh >= 0 && nh < H && nw >= 0 && nw < W && !visit[nh][nw]
					&& field[nh][nw] == C) {
				cnt++;
				cntMap(field, visit, nh, nw);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}