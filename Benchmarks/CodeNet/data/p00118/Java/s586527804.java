import java.util.*;

public class Main {

	static int H;
	static int W;
	static char[][] map;

	static void dfs(int y, int x, char c) { // cと同じ文字のところを塗りつぶし的にDFS
		map[y][x] = '.'; // 現在位置は探索済みとして.に変えておく

		if (y > 0)
			if (map[y - 1][x] == c)
				dfs(y - 1, x, c);
		if (x > 0)
			if (map[y][x - 1] == c)
				dfs(y, x - 1, c);
		if (x < W - 1)
			if (map[y][x + 1] == c)
				dfs(y, x + 1, c);
		if (y < H - 1)
			if (map[y + 1][x] == c)
				dfs(y + 1, x, c);

		return;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> ans = new ArrayList<Integer>();

		while (true) {

			H = scan.nextInt();
			W = scan.nextInt();

			if(H==0) break;

			map = new char[H][W];

			for (int i = 0; i < H; i++)
				map[i] = (scan.next()).toCharArray();

			int cnt = 0;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] != '.') {
						dfs(i, j, map[i][j]);
						cnt++;
					}
				}
			}

			ans.add(cnt);
		}

		for (Integer integer : ans) {
			System.out.println(integer);
		}

	}

}