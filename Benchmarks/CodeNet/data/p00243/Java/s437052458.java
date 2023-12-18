import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	static int Y;
	static int X;
	static int MIN;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			X = x;
			Y = y;
			if(x == 0 && y == 0) break;
			char[][] map = new char[y][x];
			for(int i = 0; i < Y; i++) {
				for(int j = 0; j < X; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			boolean[][] same = new boolean[Y][X];
			same[0][0] = true;
			cc(map,same,new boolean[Y][X],0,0);
			MIN = Integer.MAX_VALUE;
			int count = dfs(map,same,0);
			System.out.println(count);
		}
	}
	static char[] change = new char[] {'R','G','B'};
	static int dfs(char[][] map, boolean[][] same, int count) {
		if(count >= MIN) return MIN;
		char c = map[0][0];
		boolean ok = true;
		IN:for(int i = 0; i < Y; i++) {
			for(int j = 0; j < X; j++) {
				if(map[i][j] != c) {
					ok = false;
					break IN;
				}
			}
		}
		if(ok) {
			MIN = count;
			return count;
		}
		int ret = Integer.MAX_VALUE;
		char[][]    before = new char[Y][X];
		boolean[][] check  = new boolean[Y][X];
		for(int i = 0; i < 3; i++) {
			if(c == change[i]) continue;
			for(int j = 0; j < Y; j++) {
				before[j] = Arrays.copyOf(map[j]  ,  X);
				check[j]  = Arrays.copyOf(same[j] , X);
			}
			for(int j = 0; j < Y; j++) {
				for(int k = 0; k < X; k++) {
					if(check[j][k]) before[j][k] = change[i];
				}
			}
			boolean go = cc(before,check,new boolean[Y][X],0,0);
			if(go) ret = Math.min(dfs(before,check,count+1),ret);
		}
		return ret;
	}
	static boolean cc(char[][] a, boolean[][] b, boolean[][] oc,int y, int x) {
		boolean ok = false;
		if(oc[y][x]) return ok;
		oc[y][x] = true;
		for(int k = 0; k < 4; k++) {
			int ty = vy[k] + y;
			int tx = vx[k] + x;
			if(ty < 0 || tx < 0 || ty >= Y || tx >= X) continue;
			if(a[y][x] == a[ty][tx]) {
				ok |= !b[ty][tx];
				b[ty][tx] = true;
				if(!oc[ty][tx])
				ok |= cc(a,b,oc,ty,tx);
			}
		}
		return ok;
	}
}