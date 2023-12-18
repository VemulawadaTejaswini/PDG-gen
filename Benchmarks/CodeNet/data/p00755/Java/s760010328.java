import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H, W, C;
	static int[][][] f;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int ans;

	public static void main(String[] args) {
		while (true) {
			H = sc.nextInt();
			if (H == 0) break;
			W = sc.nextInt();
			C = sc.nextInt();
			f = new int[6][H][W];
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					f[0][i][j] = sc.nextInt();
				}
			}
			ans = 0;
			rec(0);
			System.out.println(ans);
		}
	}

	static void rec(int level) {
		if (level == 4) {
			change(C, level);
			count();
			return;
		}
		for (int i = 1; i <= 6; ++i) {
			change(i, level);
			rec(level + 1);
		}
	}

	static void change(int color, int level) {
		for (int i = 0; i < H; ++i) {
			System.arraycopy(f[level][i], 0, f[level + 1][i], 0, W);
		}
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(0);
		boolean[][] used = new boolean[H][W];
		used[0][0] = true;
		int sc = f[level][0][0];
		while (!q.isEmpty()) {
			int pos = q.poll();
			int cr = pos >> 8;
			int cc = pos & 0xFF;
			f[level + 1][cr][cc] = color;
			for (int i = 0; i < 4; ++i) {
				int nr = cr + DR[i];
				int nc = cc + DC[i];
				if (nr < 0 || H <= nr || nc < 0 || W <= nc || used[nr][nc]) continue;
				if (f[level + 1][nr][nc] != sc) continue;
				q.add((nr << 8) + nc);
				used[nr][nc] = true;
			}
		}
	}

	static void count() {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(0);
		boolean[][] used = new boolean[H][W];
		used[0][0] = true;
		int count = 0;
		while (!q.isEmpty()) {
			int pos = q.poll();
			int cr = pos >> 8;
			int cc = pos & 0xFF;
			++count;
			for (int i = 0; i < 4; ++i) {
				int nr = cr + DR[i];
				int nc = cc + DC[i];
				if (nr < 0 || H <= nr || nc < 0 || W <= nc || used[nr][nc]) continue;
				if (f[5][nr][nc] != f[5][0][0]) continue;
				q.add((nr << 8) + nc);
				used[nr][nc] = true;
			}
		}
		ans = Math.max(ans, count);
	}

}