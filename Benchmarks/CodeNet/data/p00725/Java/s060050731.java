import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int W, H;
	int[][] map;
	int vx[] = {0, -1, 0, 1};
	int vy[] = {-1, 0, 1, 0};
	int ans;
	
	void search(int x, int y, int cnt) {
		if (cnt >= 10) return;
//		System.out.println(x + " " + y + " " + cnt);
		for (int i = 0; i < vx.length; i++) {
			int nx = x, ny = y;
			boolean flag = false;
			while (true) {
				nx += vx[i]; ny += vy[i];
				if (map[ny][nx] == 0 || map[ny][nx] == 2) {
					flag = true;
					continue;
				}
				else if (map[ny][nx] == 1 && flag) {
					map[ny][nx] = 0;
					search(nx - vx[i], ny - vy[i], cnt + 1);
					map[ny][nx] = 1;
				}
				else if (map[ny][nx] == 3) {
					ans = Math.min(ans, cnt + 1);
					return;
				}
				break;
			}
		}
	}
	
	public void run() {
		while (true) {
			int startX = -1, startY = -1;
			W = in.nextInt(); H = in.nextInt();
			if ((W|H) == 0) break;
			map = new int[H+2][W+2];
			for (int i = 0; i < map.length; i++) {
				Arrays.fill(map[i], -1);
			}
			
			for (int i = 1; i < map.length - 1; i++) {
				for (int j = 1; j < map[i].length - 1; j++) {
					map[i][j] = in.nextInt();
					if (map[i][j] == 2) {
						startX = j; startY = i;
					}
				}
			}
			ans = Integer.MAX_VALUE;
			
			search(startX, startY, 0);
			
			System.out.println((ans != Integer.MAX_VALUE) ? ans : -1);
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}