import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ1130().doIt();
	}
	
	class AOJ1130{
		
		int w,h;
		char[][] map;
		int sx[] = {1,0,-1,0};
		int sy[] = {0,1,0,-1};
		void dfs(int x,int y){
			map[y][x] = '*';
			for(int i=0;i<4;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=w||ny<0||ny>=h)continue;
				if(map[ny][nx]=='#'||map[ny][nx]=='*')continue;
				dfs(nx,ny);
			}
		}
		
		void solve(){
			int startx=0,starty=0;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(map[i][s]=='@'){
				startx = s;starty = i;break;
			}
			dfs(startx,starty);
			int cnt = 0;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(map[i][s]=='*')cnt++;
			System.out.println(cnt);
		}
		
		void doIt(){
			while(in.hasNext()){
				w = in.nextInt();
				h = in.nextInt();
				if(w+h==0)break;
				map = new char[h][w];
				for(int i=0;i<h;i++)map[i] = in.next().toCharArray();
				solve();
			}
		}
	}
	
}