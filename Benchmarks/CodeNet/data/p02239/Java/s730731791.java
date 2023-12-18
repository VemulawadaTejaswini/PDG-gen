//API???????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	
	final static int INF = 100;
	static int[] list;
	static int a = 0;
	static int b = 1;
	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] Graph = new int[n + 1][n];
		int[] depth = new int[n + 1];
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			depth[x] = -1;
			for(int j = 0; j < y; j++){
				Graph[x][j] = Integer.parseInt(str[j + 2]);
			}
		}
		
		depth[1] = 0;
		list = new int[n + 1];
		list[0] = 1;
		
		search(Graph, depth);
		
		for(int i = 1; i <= n; i++){
			System.out.println(i + " " + depth[i]);
		}
	}
	
	public static void search(int[][] Graph, int[] depth){
		for(;a < b; a++){
			int fr = list[a];
			for(int i = 0; i < Graph[fr].length;i++){
				int to = Graph[fr][i];
				if(depth[to] == -1){
					depth[to] = depth[fr] + 1;
					list[b++] = to;
				}
			}
		}
	}
}