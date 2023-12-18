import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	static boolean[][] visited = new boolean[200][200];
	static String[] map = new String[200];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while(true) {
			int H = in.nextInt();
			int W = in.nextInt();
			if(H == 0 && W == 0) return;

			in.nextLine();

			String str = "";
			for (int i = 0; i < W + 2; i++) {
				str += ".";
			}
			map[0] = str;
			for (int i = 1; i <= H; i++) {
				String s = in.nextLine();
				map[i] = "." + s + ".";
			}
			map[H + 1] = str;

			solve(H, W, map);
		}
	}

	public static void print(String[] map, int H, int W) {
			for(int i=0;i<H+2;i++) {
			for(int j=0;j<W+2;j++) {
				System.out.print(map[i].charAt(j));
			}
			System.out.println("");
		}
	}

	public static void solve(int H, int W, String[] map) {
//		print(map, H, W);

		for(int i=0;i<200;i++) {
			for(int j=0;j<200;j++) {
				visited[i][j] = false;
			}
		}

		int ans = 0;
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				if(!visited[i][j]) {
					dfs(""+map[i].charAt(j), i, j);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	public static void dfs(String key, int h, int w) {
		visited[h][w] = true;
		int di[] = {0, 0, -1, +1};
		int dj[] = {+1, -1, 0, 0};
		for(int i=0;i<4;i++) {
			int ni = h + di[i];
			int nj = w + dj[i];
			if(visited[ni][nj] == false && (""+map[ni].charAt(nj)).equals(key)) {
				dfs(key, ni, nj);
			}
		}
	}

}