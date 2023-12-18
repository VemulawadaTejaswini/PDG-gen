import java.util.*;

class Main {
	static int map[][] = new int[100][100];
	static int dx[] = {1,1,0,-1,-1,-1,0,1};
	static int dy[] = {0,1,1,1,0,-1,-1,-1};
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int w = in.nextInt(), h = in.nextInt();
			if(w==0) return ;
			for(int i=1; i<=h; i++)
				for(int j=1; j<=w;j++)
					map[i][j] = in.nextInt();
			int ans = 0;
			for(int i=1; i<=h; i++)
				for(int j=1; j<=w; j++)
					if(map[i][j] == 1){
						ans++;
						dfs(i,j);
					}
			System.out.println(ans);
		}
	}
	
	private static void dfs(int x, int y){
		if(map[x][y] != 1) return ;
		map[x][y] = 0;
		for(int i=0; i<8; i++){
			dfs(x+dx[i], y+dy[i]);
		}
	}
}