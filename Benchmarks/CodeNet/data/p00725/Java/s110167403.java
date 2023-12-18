

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	int[][] map;
	int w;
	int h;
	int sx = -1;
	int sy = -1;
	int gx = -1;
	int gy = -1;
	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			map = new int[h][w];
			
			if(h==0 && w==0)
				break;
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j] == 2){
						sx = j;
						sy = i;
					}else if(map[i][j] == 3){
						gx = j;
						gy = i;
					}
				}
			}
//			System.out.println(sx + " "+sy);
			solve();
		}
	}

	public void solve() {
		int res = rec(0, sx, sy);
		System.out.println(res>=100 ? -1 : res);
	}

	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };
	private int rec(int n, int x, int y) {
		if(n>=10)
			return 100;
		
		int res = 100;
		for(int i=0;i<4;i++){
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx<0 || w<=nx || ny<0 || h<=ny || map[ny][nx]==1)
				continue;
			
			while(!(nx<0 || w<=nx || ny<0 || h<=ny || map[ny][nx]==1)){
				if(map[ny][nx]==3)
					return n+1;
				nx += dx[i];
				ny += dy[i];
				
			}
			
			if(nx<0 || w<=nx || ny<0 || h<=ny)
				continue;
			nx -= dx[i];
			ny -= dy[i];
			
			map[ny+dy[i]][nx+dx[i]] = 0;
			res = Math.min(res, rec(n+1, nx, ny));
			map[ny+dy[i]][nx+dx[i]] = 1;
		}
		
		
		return res;
	}

}