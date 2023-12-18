import java.util.*;

public class Main{
	public static char[][] map;
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};

	public static int dfs(int x, int y){
		int ans=1;
		map[y][x] = '#';
		for(int i=0;i<4;i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0<=nx && nx<map[0].length && 0<=ny && ny<map.length && map[ny][nx] == '.'){
				ans += dfs(nx,ny);
			}
		}
		return ans;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		while(true){
			int w=sc.nextInt(), h=sc.nextInt();
			if(w==0 && h==0) break;

			map = new char[h][w];
			int x=0, y=0;
			for(int i=0;i<h;i++){
				map[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(map[i][j]=='@'){x=j; y=i; map[i][j]='.';}
				}
			}
			System.out.println(dfs(x,y));
		}
	}
}