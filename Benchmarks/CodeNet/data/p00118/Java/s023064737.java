import java.util.Scanner;

public class Main {
	char[][] map;
	int h, w;
	char c;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if (w + h == 0) break;
			map = new char[h][];
			for (int i = 0; i < h; i++)
				map[i] = new char[w];
			for (int y = 0; y < h; y++) {
				char[] str = scan.next().toCharArray();
				for (int x = 0; x < w; x++) {
					map[y][x] = str[x];
				}
			}
			int ans = 0;
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					if (map[y][x] != 'x') {
						c = map[y][x];
						bfs(y, x);
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	void bfs(int y, int x) {
		if (y < 0 || x < 0 || y >= h || x >= w || map[y][x] != c) return;
		map[y][x] = 'x';
		int[] dy = { 1, 0, -1,  0 };
		int[] dx = { 0, 1,  0, -1 };
		for (int i = 0; i < 4; i++) {
			bfs(y + dy[i], x + dx[i]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}