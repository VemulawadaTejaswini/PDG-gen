import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int W, H, N;
	static int[][] horz, vert;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		W = sc.nextInt();
		H = sc.nextInt();
		N = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		horz = new int[H + 1][W];
		vert = new int[H][W + 1];
		for (int i = 0; i < N; ++i) {
			move();
		}
		System.out.println(search((x1 << 16) + y1, (x2 << 16) + y2));
	}

	static int search(int p1, int p2) {
		PriorityQueue<Long> q = new PriorityQueue<Long>();
		q.add((long) p1);
		boolean[][] visited = new boolean[H + 1][W + 1];
		while (true) {
			long cur = q.poll();
			int pos = (int) cur;
			long val = cur >> 32;
			if (pos == p2) return (int) val;
			int x = pos >> 16;
			int y = pos & 0xFFFF;
			if (visited[y][x]) continue;
			visited[y][x] = true;
			for (int i = 0; i < 4; ++i) {
				int nx = x + DC[i];
				int ny = y + DR[i];
				if (nx < 0 || W < nx || ny < 0 || H < ny || visited[ny][nx]) continue;
				int nv;
				if (y != ny) {
					nv = vert[Math.min(y, ny)][x];
				} else {
					nv = horz[y][Math.min(x, nx)];
				}
				q.add(((val + nv) << 32) + (nx << 16) + ny);
			}
		}
	}

	static void move() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		char[] move = sc.next().toCharArray();
		int[] dir = new int[move.length];
		for (int i = 0; i < move.length; ++i) {
			dir[i] = "DRUL".indexOf(move[i]);
		}
		for (int i = 0; i < t; ++i) {
			for (int j = 0; j < dir.length; ++j) {
				int ny = y + DR[dir[j]];
				int nx = x + DC[dir[j]];
				if (ny < 0) ny = 0;
				if (ny >= H) ny = H - 1;
				if (nx < 0) nx = 0;
				if (nx >= W) nx = W - 1;
				if (y != ny) {
					horz[Math.min(y, ny) + 1][x]++;
				} else if (x != nx) {
					vert[y][Math.min(x, nx) + 1]++;
				}
				y = ny;
				x = nx;
			}
		}
	}

}