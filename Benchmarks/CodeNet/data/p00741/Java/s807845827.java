import java.util.Scanner;

class Sea {
	private int w;
	private int h;
	private int atlas[][];
	public Sea(int w, int h, int[][] atlas) {
		this.w = w;
		this.h = h;
		this.atlas = atlas;
	}
	// atlasに破壊的操作を及ぼす. もしそうでありたくないのであれば, 
	// clone()でshallow copyを作るとかの実装にしなければいけない. 
	// その場合は, メモリ消費に気をつける. 
	private void dfs(int x, int y) {
		atlas[x][y] = 0;
		for (int dx = -1; dx <= 1; ++dx) {
			for (int dy = -1; dy <= 1; ++dy) {
				int nx = x + dx; int ny = y + dy;
				if (out(nx, ny)) continue;
				if (atlas[nx][ny] == 1) dfs(nx, ny);
			}
		}
	}
	public boolean in(int x, int y) {
		return (0 <= x && x < h) && (0 <= y && y < w);
	}
	public boolean out(int x, int y) {
		return !in(x, y);
	}
	public int countIsland() {
		int cnt = 0;
		for (int x = 0; x < h; ++x)
			for (int y = 0; y < w; ++y)
				if (atlas[x][y] == 1) {
					dfs(x, y);
					++cnt;
				}
		return cnt;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) break;
			int atlas[][] = new int[h][w];
			for (int i = 0; i < h; ++i)
				for (int j = 0; j < w; ++j)
					atlas[i][j] = sc.nextInt();
			Sea sea = new Sea(w, h, atlas);
			out.append(sea.countIsland() + "\n");
		}
		System.out.print(out);
	}
}
