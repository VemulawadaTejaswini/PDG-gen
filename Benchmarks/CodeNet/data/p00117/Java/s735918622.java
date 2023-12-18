import java.util.*;
import java.io.*;

public class Main{
	final int INF = 1000000001;
	
	public int search(int[][] graph, int start, int goal){
		int[] cost = new int[graph.length];
		for(int i = 0; i < cost.length; i++){
			if( i == start ){
				cost[i] = 0;
				continue;
			}
			cost[i] = INF;
		}
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(start);
		while( !set.contains(goal) ){
			int min_a = 0;
			int min_b = 1;
			for(Integer x : set){
				for(int i = 1; i < cost.length; i++){
					if( cost[i] < INF || x == i ){
						continue;
					}
					if( graph[x][i] + cost[x] < graph[min_a][min_b] + cost[min_a] ){
						min_a = x;
						min_b = i;
		//				System.out.println("reviewed  min_a = " + min_a + ", min_b = " + min_b);
					}
				}				
			}
			cost[min_b] = graph[min_a][min_b] + cost[min_a];
			set.add(min_b);			
		}
		return cost[goal];
	}
	public void solve() throws IOException{
		int n = nextInt(), m = nextInt();
		int[][] graph = new int[n+1][n+1];
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph[0].length; j++){
				if( i == j ){
					continue;
				}
				graph[i][j] = INF;
			}
		}
		String[][] temp = new String[m+1][];
		for(int i = 0; i < m; i++){
			temp[i] = nextToken().split(",");
			int a = Integer.parseInt(temp[i][0]);
			int b = Integer.parseInt(temp[i][1]);
			graph[a][b] = Integer.parseInt(temp[i][2]);
			graph[b][a] = Integer.parseInt(temp[i][3]);
		}
	/*	System.out.println();
		for(int[] x : graph){
			for(int y : x){
				System.out.print(y + " ");
			}
			System.out.println();
		}*/
		temp[m] = nextToken().split(",");
		int start = Integer.parseInt(temp[m][0]);
		int goal = Integer.parseInt(temp[m][1]);
		int reward = Integer.parseInt(temp[m][2]);
		int cost = Integer.parseInt(temp[m][3]);
		int ans = reward - cost - search(graph, start, goal) - search(graph, goal, start);
		System.out.println(ans);
	}		
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}