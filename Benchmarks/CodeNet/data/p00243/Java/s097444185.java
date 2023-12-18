import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0) break;
			char[][] map = new char[y][x];
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			boolean[][] same = new boolean[y][x];
			same[0][0] = true;
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					for(int k = 0; k < 4; k++) {
						int ty = vy[k] + i;
						int tx = vx[k] + j;
						if(ty < 0 || tx < 0 || ty >= y || tx >= x) continue;
						if(same[ty][tx] && map[i][j] == map[ty][tx]) {
							same[i][j] = true;
							break;
						}
					}
				}
			}
			
			int count = dfs(map,same,0);
			
			System.out.println(count);
		}
	}
	static char[] change = new char[] {'R','G','B'};
	static int dfs(char[][] map, boolean[][] same, int count) {
		char c = map[0][0];
		boolean ok = true;
		IN:for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map[i][j] != c) {
					ok = false;
					break IN;
				}
			}
		}
		if(ok) return count;
		int ret = Integer.MAX_VALUE;
		char[][]    before = new char[map.length][map[0].length];
		boolean[][] check  = new boolean[map.length][map[0].length];
		for(int i = 0; i < 3; i++) {
			if(c == change[i]) continue;
			for(int j = 0; j < map.length; j++) {
				before[j] = Arrays.copyOf(map[j]  ,   map[j].length);
				check[j]  = Arrays.copyOf(same[j] , same[j].length);
			}
			for(int j = 0; j < map.length; j++) {
				for(int k = 0; k < map[j].length; k++) {
					if(check[j][k]) before[j][k] = change[i];
				}
			}
			boolean go = false;
			for(int j = 0; j < map.length; j++) {
				for(int k = 0; k < map[j].length; k++) {
					if(check[j][k]) continue;
					for(int l = 0; l < 4; l++) {
						int ty = vy[l] + j;
						int tx = vx[l] + k;
						if(ty < 0 || tx < 0 || ty >= map.length || tx >= map[ty].length) continue;
						if(check[ty][tx] && before[j][k] == before[ty][tx]) {
							check[j][k] = true;
							go = true;
							break;
						}
					}
				}
			}
			if(go)
			ret = Math.min(dfs(before,check,count+1),ret);
		}
		return ret;
	}
}