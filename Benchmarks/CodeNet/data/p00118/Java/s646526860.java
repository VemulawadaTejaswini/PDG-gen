
import java.io.*;
import java.util.*;
public class Main{
	static int X,Y;
	static int[][] field;
	static boolean[][] done;
	static final int[] dx = {1,0,-1,0};
	static final int[] dy = {0,1,0,-1};
	static int ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input[] = br.readLine().split(" +");
			Y = new Integer(input[0]);
			X = new Integer(input[1]);
			if(X==0 & Y==0) break;
			
			field = new int[X][Y];
			done = new boolean[X][Y];
			for(int y = 0; y < Y; y++){
				String in = br.readLine();
				for(int x = 0; x < X; x++){
					done[x][y] = false;
					
					String mark = in.substring(x, x+1);
					if(mark.equals("#")){
						field[x][y] = 0;
					}else if(mark.equals("@")){
						field[x][y] = 1;
					}else if(mark.equals("*")){
						field[x][y] = 2;
					}
				}
			}
			ans = 0;
			for(int y = 0; y < Y; y++){
				for(int x = 0; x < X; x++){
					if(!done[x][y]){
						ans++;
						dfs(x,y,field[x][y]);
					}					
				}
			}
			System.out.println(ans);
		}
	}

	private static void dfs(int x, int y, int type) {
		done[x][y] = true;
		for(int i = 0; i < 4; i++){
			if(x+dx[i]<0 | x+dx[i]>=X) continue;
			if(y+dy[i]<0 | y+dy[i]>=Y) continue;
			if(done[x+dx[i]][y+dy[i]]) continue;
			if(field[x+dx[i]][y+dy[i]] != type) continue;
			dfs(x+dx[i], y+dy[i], type);
		}
	}	
}