import java.util.Scanner;

public class Main {
	static int h, w, c;
	static int a[][];
	static int dx[] = {-1, 0, 0, 1};
	static int dy[] = {0, -1, 1, 0};
	
	public static int f(int k) {
		int b[][] = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				b[i][j] = a[i][j];
			}
		}
		
		if (k == 6) {
			int cnt = count(c, 0, 0);
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = b[i][j];
				}
			}
			return cnt;
		}
		
		int max = 0;
		for (int q = 1; q <= 6; q++) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = b[i][j];
				}
			}
			if (q != a[0][0]) {
				change(b, q, 0, 0);
				max = Math.max(max, f(k + 1));
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = b[i][j];
			}
		}
		return max;
	}
	
	public static void change(int b[][], int c, int x, int y) {
		int k = b[0][0];
		a[y][x] = c;
		for (int i = 0; i < 4; i++) {
			if (0 <= x + dx[i] && x + dx[i] < w && 0 <= y + dy[i] && y + dy[i] < h) {
				if (a[y + dy[i]][x + dx[i]] == k) {
					change(b, c, x + dx[i], y + dy[i]);
				}
			}
		}
	}
	
	public static int count(int k, int x, int y) {
		int cnt = 1;
		a[y][x] = -1;
		for (int i = 0; i < 4; i++) {
			if (0 <= x + dx[i] && x + dx[i] < w && 0 <= y + dy[i] && y + dy[i] < h) {
				if (a[y + dy[i]][x + dx[i]] == k) {
					cnt += count(k, x + dx[i], y + dy[i]);
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if ((h | w | c) == 0) {
				break;
			}
			
			a = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println(f(1));
		}
	}
}