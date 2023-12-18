import java.util.*;
public class Main {
	static int w,h;
	static char map[][]=new char[21][21];
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	static int max=9999999;
	static int[][] kioku =new int[21][21];
	static void dfs(int x,int y,int sum){
		for(int i=0;i<4;i++){
			int nx = dx[i]+x;
			int ny = dy[i]+y;
			if(nx<0|nx>=w||ny<0||ny>=h||map[ny][nx]=='#'||kioku[ny][nx]!=max)continue;
			kioku[ny][nx]=1;
			dfs(nx,ny,sum+1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			w=in.nextInt();
			h=in.nextInt();
			if(w+h==0)break;
			int sx=0,sy=0;
			for(int i=0;i<h;i++){
				String test = in.next();
				for(int s=0;s<w;s++){
					kioku[i][s]=max;
					map[i][s]=test.charAt(s);
					if(test.charAt(s)=='@'){
						sx=s;sy=i;
					}
				}
			}
			dfs(sx,sy,0);
			int result = 0;
			for(int i=0;i<h;i++){
				for(int s=0;s<w;s++){
					if(kioku[i][s]==max)continue;
					result += kioku[i][s];
				}
			}
			System.out.println(result);
		}




	}
}