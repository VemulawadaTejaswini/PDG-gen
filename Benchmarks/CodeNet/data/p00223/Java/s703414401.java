import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0) break;
			
			int tx = sc.nextInt()-1;
			int ty = sc.nextInt()-1;
			
			int kx = sc.nextInt()-1;
			int ky = sc.nextInt()-1;
			
			map = new int[y][x];
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int ans = solv(x,y,tx,ty,kx,ky);
			
			if(ans == -1 || ans == 100) {
				System.out.println("NA");
			}
			else {
				System.out.println(ans);
			}
		}
	}
	static Queue<Data> queue = new ArrayDeque<Data>();
	static HashMap<String,Boolean> h_map = new HashMap<String,Boolean>();
	static int[] vyt = new int[] {1,0,-1,0};
	static int[] vxt = new int[] {0,1,0,-1};
	static int[] vyk = new int[] {-1,0,1,0};
	static int[] vxk = new int[] {0,-1,0,1};
	
	
	static int solv(int x, int y, int tx, int ty, int kx, int ky) {
		queue.clear();
		h_map.clear();
		queue.add(new Data(0,x,y,tx,ty,kx,ky));
		
		while(!queue.isEmpty()) {
			Data data = queue.poll();
			if(data.tx == data.kx && data.ty == data.ky) return data.time;
			bfs(data);
		}
		return -1;
	}
	
	static void bfs(Data a) {
		for(int i = 0; i < 4; i++) {
			
			int movetx = a.tx + vxt[i];
			int movety = a.ty + vyt[i];
			int movekx = a.kx + vxk[i];
			int moveky = a.ky + vyk[i];
			Data next = new Data(a.time+1 ,a.x ,a.y ,movetx ,movety ,movekx ,moveky );
			if(next.time >= 100) {
				queue.clear();
				return;
			}
			if(movetx >= a.x || movety >= a.y || movetx < 0 || movety < 0 || map[movety][movetx] == 1) {
				next.tx = a.tx;
				next.ty = a.ty;
			}
			if(movekx >= a.x || moveky >= a.y || movekx < 0 || moveky < 0 || map[moveky][movekx] == 1) {
				next.kx = a.kx;
				next.ky = a.ky;
			}
			String tmp = next.tx+""+next.ty+""+next.kx+""+next.ky;
			if(h_map.containsKey(tmp)) continue;
			
			h_map.put(tmp, true);
			
			queue.add(next);
			
		}
	}
	
	
	
	
	
	static class Data {
		int time;
		int x;
		int y;
		int tx;
		int ty;
		int kx;
		int ky;
		
		Data() {
			time = 0;
			x = 0;
			y = 0;
			tx = 0;
			ty = 0;
			kx = 0;
			ky = 0;
		}
		
		Data(int a, int b, int c, int d, int e, int f, int g) {
			time = a;
			x = b;
			y = c;
			tx = d;
			ty = e;
			kx = f;
			ky = g;
		}
		
		
	}
 	
}