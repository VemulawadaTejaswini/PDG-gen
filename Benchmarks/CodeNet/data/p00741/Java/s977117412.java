import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int w,h;
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[][] field;
	
	static boolean read() {
		w = sc.nextInt();
		h = sc.nextInt();
		if(w == 0 && h == 0)
			return false;
		
		field = new int[h+1][w+1];
		for(int i = 1; i <= h; i++)
			for(int j = 1; j <= w; j++)
				field[i][j] = sc.nextInt();
		return true;
	}
	
	static boolean inField(int x, int y) {
		return (x >= 1 && x <= w && y >= 1 && y <= h);
	}
	
	static void dfs(int x, int y) {
		field[y][x] = 0;
		for(int k = 0; k < 8; k++)  {
			int nx = x + dx[k], ny = y + dy[k];
			if(inField(nx, ny) && field[ny][nx] == 1)
				dfs(nx, ny);
		}
			
	}
	
	static int solve() {
		int ret = 0;
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				if(field[i][j] == 1) {
					ret++;
					dfs(j, i);
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
}