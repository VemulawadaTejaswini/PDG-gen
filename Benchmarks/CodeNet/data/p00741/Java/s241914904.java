import java.util.Scanner;

public class Main {
	public static int[][] map;
	public static int[][] passed;
	public static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
	public static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0) break;
			
			map = new int[h][w];/* 地図の初期化 */
			for(int i = 0 ; i < h; i++)
				for(int j = 0; j < w; j++)
					map[i][j] = sc.nextInt();
			passed = new int[h][w];/* 通った場所の初期化 */
			
			int cnt = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++) {
					/* 探索したことのない陸地 */
					if(map[i][j] == 1 && passed[i][j] == 0) {
						search(i, j);/* 周囲の島を探索 */
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void search(int y, int x) {
		passed[y][x] = 1;/* 無限ループ回避のためここでチェック */

		/* 周囲の陸地探索 */
		for(int i = 0; i < 8; i++) {
			int new_y = y + dy[i];
			int new_x = x + dx[i];
			/* 配列外に出ないように */
			if((0 <= new_y) && (new_y < map.length)
				&& (0 <= new_x) && (new_x < map[0].length)) {
				/* 通ったことのない陸地 */
				if(passed[new_y][new_x] == 0 && map[new_y][new_x] == 1) {
					search(new_y, new_x);
				}
			}
		}
	}
}

