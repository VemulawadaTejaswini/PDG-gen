import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int w = in.nextInt(),h = in.nextInt(),c = in.nextInt();
			if(w+h+c==0)break;
			new AOJ1174().doIt(w, h, c);
		}
	}
	
	class AOJ1174{
		int max = 0;
		int[][] map;
		int h,w,c;
		int sx[] = {0,1,-1,0};
		int sy[] = {1,0,0,-1};
		boolean sw[][],flg[][];
		void dfs_2(int x,int y){
			sw[y][x] = true;
			for(int i=0;i<4;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=w||ny<0||ny>=h||sw[ny][nx]||map[ny][nx]!=c)continue;
				dfs_2(nx,ny);
			}
		}
		
		void set(){
			if(map[0][0]!=c)return;
			sw = new boolean[h][w];
			int cnt = 0;
			dfs_2(0, 0);
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(sw[i][s])cnt++;
			max = Math.max(max, cnt);
		}
		
		void color_change(int x,int y,int color,int from){
			flg[y][x] = true;
			map[y][x] = color;
			for(int i=0;i<4;i++){
				int nx = sx[i]+x;
				int ny = sy[i]+y;
				if(nx<0||nx>=w||ny<0||ny>=h||flg[ny][nx]||map[ny][nx]!=from)continue;
				color_change(nx, ny, color,from);
			}
		}
		
		void dfs(int fase){
			if(fase==5){
				set();return;
			}
			for(int j=1;j<=6;j++){
				if(j==map[0][0])continue;
				int memo[][] = new int[h][w];
				for(int i=0;i<h;i++)for(int s=0;s<w;s++)memo[i][s] = map[i][s];
				flg = new boolean[h][w];
				color_change(0, 0, j,map[0][0]);
				dfs(fase+1);
				for(int i=0;i<h;i++)for(int s=0;s<w;s++)map[i][s] = memo[i][s];
			}
		}
		
		void print(int[][] m){// deba
			for(int i=0;i<h;i++){
				for(int s=0;s<w;s++)System.out.print(m[i][s]+" ");
				System.out.println();
			}
		}
		
		void doIt(int h,int w,int c){
			map = new int[h][w];
			this.h = h;this.w = w;this.c = c;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)map[i][s] = in.nextInt();
			dfs(0);
			System.out.println(max);
		}
	}
	
}