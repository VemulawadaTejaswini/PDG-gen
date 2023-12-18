import java.util.Arrays;
import java.util.Scanner;
   
   
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[][] map = new int[h][w];
		boolean[][] ok = new boolean[h][w];
		for(int i = 0 ; i < h; i++) {
			for(int j = 0; j < w; j++) {
				map[i][j] = sc.nextInt();
				ok[i][j] = (map[i][j] == 1)?false:true;
			}
		}
		for(int i = 0; i < h; i++) {
			dfs(0,i,ok);
			dfs(w-1,i,ok);
		}
		for(int i = 0; i < w; i++) {
			dfs(i,0,ok);
			dfs(i,h-1,ok);
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				ok[i][j] = (map[i][j] == 1)?true:ok[i][j];
			}
		}
		int sum = 0;
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] == 1) {
					int count = 0;
					if(i % 2 == 0) {
						for(int k = 0; k < 6; k++) {
							int ty = i + vy[k];
							int tx = j + vx1[k];
							if(tx < 0 || ty < 0 || ty >= ok.length || tx >= ok[ty].length || !ok[ty][tx]) continue;
							count++;
						}
					}
					else {
						for(int k = 0; k < 6; k++) {
							int ty = i + vy[k];
							int tx = j + vx2[k];
							if(tx < 0 || ty < 0 || ty >= ok.length || tx >= ok[ty].length || !ok[ty][tx]) continue;
							count++;
						}
					}
					sum += 6 - count;
				}
			}
		}
		System.out.println(sum);
		
		
		
	}
	
	static int[] vx1 = {0 ,1 ,-1,1 ,0 ,1 };
	static int[] vx2 = {-1,0 ,-1,1 ,-1,0 };
	static int[] vy  = {-1,-1,0 ,0 ,1 ,1 };
	
	static void dfs(int x, int y, boolean[][] c) {
		if(x < 0 || y < 0 || y >= c.length || x >= c[y].length || !c[y][x]) return;
		c[y][x] = false;
		if(y % 2 == 0) {
			for(int i = 0; i < 6; i++) {
				dfs(x + vx1[i], y + vy[i],c);
			}
		}
		else {
			for(int i = 0; i < 6; i++) {
				dfs(x + vx2[i], y + vy[i],c);
			}
		}
	}
	
}