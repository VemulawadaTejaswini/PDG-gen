import java.io.*;
import java.util.*;
class Main{
	public static boolean[][] visited;
	public static int[][] cost;
	public static char[][] grid;
	public static int h;
	public static int w;
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Buffered
		int t = 1;
		// t = Integer.parseInt(reader.readLine());
		// long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		for(int u = 0;u<t;u++){
			String[] hw = reader.readLine().split(" ");
			String[] startcord = reader.readLine().split(" ");
			String[] endcord = reader.readLine().split(" ");
			h = Integer.parseInt(hw[0]);
		 	w = Integer.parseInt(hw[1]);
			visited = new boolean[h][w];
			grid = new char[h][w];
			cost = new int[h][w];
			int sr = Integer.parseInt(startcord[0]);
			int sc = Integer.parseInt(startcord[1]);
			int er = Integer.parseInt(endcord[0]);
			int ec = Integer.parseInt(endcord[1]);
			sr--;
			sc--;
			er--;
			ec--;
			for(int i = 0;i<grid.length;i++){
				grid[i] = reader.readLine().toCharArray(); 
			}
			if(grid[sr][sc]=='#' || grid[er][ec] == '#'){
				System.out.println(-1);
				return;
			}
			explore(sr,sc,0);
			//explore(er,ec,0);
			int t1 = 1;
			boolean[][] explore2bool = new boolean[h][w];
			while(!visited[er][ec]){
				int check = 0;
				for(int i = 0;i<h;i++){
					for(int j = 0;j<w;j++){
						if(visited[i][j] && !explore2bool[i][j]){
							explore2(i,j,t1);
							explore2bool[i][j] =true;
							check++;
						}
					}
				}
				if(check==0) break;
				t1++;
			}
			System.out.println(visited[er][ec]?cost[er][ec]:-1);
		}
	}
	public static void explore(int a,int b,int cos){
		cost[a][b] = cos;
		visited[a][b] = true;
		for(int i = a+1;i<h;i++){
			if(grid[i][b]=='#') break;
			if(!visited[i][b] && grid[i][b]=='.'){
				explore(i,b,cos);
			}
		}
		for(int i = b+1;i<w;i++){
			if(grid[a][i]=='#') break;
			if(!visited[a][i] && grid[a][i]=='.'){
				explore(a,i,cos);
			}
		}
		for(int i = a-1;i>=0;i--){
			if(grid[i][b]=='#') break;
			if(!visited[i][b] && grid[i][b]=='.'){
				explore(i,b,cos);
			}
		}
		for(int i = b-1;i>=0;i--){
			if(grid[a][i]=='#') break;
			if(!visited[a][i] && grid[a][i]=='.'){
				explore(a,i,cos);
			}
		}
	}
	public static void explore2(int a,int b,int cos){
		for(int i = a-2;i<=a+2;i++){
			for(int j = b-2;j<=b+2;j++){
				if(i>=0 && i<h && j>=0 && j<w && !visited[i][j] && grid[i][j]!='#'){
					explore(i,j,cos);
				}
			}
		}
	}
	
}
class pair implements Comparable<pair>{
		long a = 0;
		int b = 0;
		public pair(long a,int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(pair p){
			if(this.a == p.a) return -(Integer.compare(this.b,p.b));
			else return -(Long.compare(this.a,p.a));
		}
		@Override
		public String toString(){
			return a+" "+b;
		}
	}