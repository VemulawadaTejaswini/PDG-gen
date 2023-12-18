import java.util.*;
import java.math.*;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			if(m == 0 && n == 0) break;
			
			boolean[][] map = new boolean[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					map[i][j] = (sc.nextInt() == 1)?true:false;
				}
			}
			
			ArrayDeque<Data> queue = new ArrayDeque<Data>();
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(!map[i][j]) continue;
					boolean[][] cp = new boolean[n][m];
					for(int k = 0; k < n; k++) {
						cp[k] = Arrays.copyOf(map[k], map[k].length);
					}
					cp[i][j] = false;
					queue.add(new Data(cp,i,j,1));
				}
			}
			
			int[] vx = new int[] {1,0,-1,0};
			int[] vy = new int[] {0,1,0,-1};
			int max = 0;
			
			while(!queue.isEmpty()) {
				
				
				Data tmp = queue.poll();
				max = Math.max(max, tmp.sum);
				for(int i = 0; i < 4; i++) {
					int ty = tmp.y + vy[i];
					int tx = tmp.x + vx[i];
					if(!rcheck(ty,tx,n,m) || !tmp.map[ty][tx]) continue;
					boolean[][] cp = new boolean[n][m];
					for(int j = 0; j < n; j++) {
						cp[j] = Arrays.copyOf(tmp.map[j], tmp.map[j].length);
					}
					cp[ty][tx] = false;
					queue.add(new Data(cp,ty,tx,tmp.sum+1));
				}
			}
			System.out.println(max);
			System.gc();
			
			
			
			
			
			
			
		}
	}
	static boolean rcheck(int y, int x, int my, int mx) {
		if(y < 0 || x < 0 || y >= my || x >= mx) return false;
		return true;
	}
	
	
	static class Data {
		boolean[][] map;
		int y;
		int x;
		int sum;
		Data(boolean[][] a, int b, int c, int d) {
			map = a;
			y = b;
			x = c;
			sum = d;
		}
	}
	
}