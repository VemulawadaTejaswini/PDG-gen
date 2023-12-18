import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int W, H;
	static int[][] f;
	static int gr, gc;

	public static void main(String[] args) {
		W = sc.nextInt();
		H = sc.nextInt();
		f = new int[H][W];
		for (int i = 0; i < H; ++i) {
			char[] line = sc.next().toCharArray();
			for (int j = 0; j < W; ++j) {
				char c = line[j];
				if (c == '#') {
					f[i][j] = 9999;
				} else if (c == 't') {
					gr = i;
					gc = j;
				}
			}
		}
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			f[y][x] = i + 1;
		}
		if (!solve(N)) {
			System.out.println(-1);
			return;
		}
		int hi = N;
		int lo = -1;
		while (hi - lo > 1) {
			int mid = (hi + lo) / 2;
			if (solve(mid)) {
				hi = mid;
			} else {
				lo = mid;
			}
		}
		System.out.println(hi);
	}

	static boolean solve(int t) {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(0);
		boolean[][] visited = new boolean[H][W];
		while (!q.isEmpty()) {
			int pos = q.poll();
			int r = pos >> 10;
			int c = pos & 0x3FF;
			for (int i = 0; i < 4; ++i) {
				int nr = r + DR[i];
				int nc = c + DC[i];
				if (nr < 0 || H <= nr || nc < 0 || W <= nc || visited[nr][nc] || f[nr][nc] > t) continue;
				if (nr == gr && nc == gc) return true;
				q.add((nr << 10) + nc);
				visited[nr][nc] = true;
			}
		}
		return false;
	}

}