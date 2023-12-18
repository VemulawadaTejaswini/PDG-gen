import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayDeque<Data> stack = new ArrayDeque<Data>();
	static int[] vx = new int[] {1,0,-1,0};
	static int[] vy = new int[] {0,1,0,-1};
	public static void main(String[] args) {
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			
			int sx = 0;
			int sy = 0;
			
			int gx = 0;
			int gy = 0;
			boolean[][] map = new boolean[h][w];
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					int tmp = sc.nextInt();
					if(tmp == 1) {
						map[i][j] = true;
					}
					if(tmp == 2) {
						sx = j;
						sy = i;
					}
					if(tmp == 3) {
						gx = j;
						gy = i;
					}
				}
			}
			
			int ans = solv(sx,sy,gx,gy,map);
			
			System.out.println(ans);
		}
	}
	
	static int solv(int a, int b, int c, int d, boolean[][] e) {
		stack.clear();
		stack.addLast(new Data(a,b,e,1));
		int ans = Integer.MAX_VALUE;
		while(!stack.isEmpty()) {
			Data tmp = stack.pollFirst();
			if(tmp.count >= 11) {
				stack.clear();
				return -1;
			}
			ans = Math.min(bfs(tmp.x, tmp.y, c,d,tmp.map,tmp.count),ans);
			if(ans != Integer.MAX_VALUE) {
				stack.clear();
				break;
			}
		}
		if(ans == Integer.MAX_VALUE) {
			return -1;
		}
		return ans;
	}
	
	static int bfs(int a, int b, int c, int d, boolean[][] e, int count) {
		int tmpa = a;
		int tmpb = b;
		for(int i = 0; i < 4; i++) {
			tmpa = a;
			tmpb = b;
			if(tmpa+vx[i] < 0 || tmpb+vy[i] < 0 || tmpb+vy[i] >= e.length || tmpa+vx[i] >= e[tmpb].length || e[tmpb+vy[i]][tmpa+vx[i]]) {
				continue;
			}
			while(true) {
				tmpa += vx[i];
				tmpb += vy[i];
				if(tmpa < 0 || tmpb < 0 || tmpb >= e.length || tmpa >= e[tmpb].length) {
					break;
				}
				if(tmpb == d && tmpa == c) {
					return count;
				}
				if(e[tmpb][tmpa]) {
					e[tmpb][tmpa] = false;
					tmpa -= vx[i];
					tmpb -= vy[i];
					boolean[][] tmp = new boolean[e.length][];
					for(int j = 0; j < e.length; j++) {
						tmp[j] = Arrays.copyOf(e[j],e[j].length);
					}
					stack.addLast(new Data(tmpa,tmpb,tmp,count+1));
					e[tmpb][tmpa] = true;
					break;
				}
			}
		}
		return Integer.MAX_VALUE;
	}
	
	static class Data {
		int x;
		int y;
		int count;
		boolean[][] map;
		Data(int a, int b, boolean[][] c,int d) {
			x = a;
			y = b;
			map = c;
			count = d;
		}
	}
}

			
			
	