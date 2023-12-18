import java.util.*;
import java.io.*;
public class Main {
	static int[][] dp;
	static int h;
	static int w;
	static int k;
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 
		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		h = Integer.parseInt(st.nextToken());
 		w = Integer.parseInt(st.nextToken());
 		k = Integer.parseInt(st.nextToken());
 		StringTokenizer coords = new StringTokenizer(bf.readLine());
 		int x1 = Integer.parseInt(coords.nextToken());
 		int y1 = Integer.parseInt(coords.nextToken());
 		int x2 = Integer.parseInt(coords.nextToken());
 		int y2 = Integer.parseInt(coords.nextToken());
 		char[][] c = new char[h+1][w+1];
 		dp = new int[h+1][w+1];
 		for(int i = 1;i<=h;i++){
 			String line = bf.readLine().trim();
 			for(int j = 1;j<=w;j++){
 				c[i][j] = line.charAt(j-1);
 			}
 		}
 		// EVERYTHING IS INFLATED BY ONE
 		dp[x1][y1] = 1;
 		
 		Queue<Integer> bfs = new ArrayDeque<Integer>();
 		ArrayList<Integer> first = new ArrayList<Integer>();
 		bfs.add((x1-1)*w+(y1-1));
 		while(!bfs.isEmpty()){
 			int p = bfs.remove();
 			int tx = p/w+1;
 			int ty = p%w+1;
 			ArrayList<Integer> adds = new ArrayList<Integer>();
 			for(int i = tx+1;i<=Math.min(tx+k,h);i++){
 				if (c[i][ty] == '@')
 					break;
 				if (dp[i][ty] != 0 )
 					break;
 				adds.add((i-1)*w+(ty-1));
 				bfs.add((i-1)*w+(ty-1));
 			}
 			
 			for(int i = tx-1;i>=Math.max(tx-k,1);i--){
 				if (c[i][ty] == '@')
 					break;
 				if (dp[i][ty] != 0)
 					break;

 				adds.add((i-1)*w+(ty-1));
 				bfs.add((i-1)*w+(ty-1));

 			}
 			
 			for(int i = ty+1;i<=Math.min(ty+k,w);i++){
 				if (c[tx][i] == '@')
 					break;
 				if (dp[tx][i] != 0 )
 					break;

 				adds.add((tx-1)*w+(i-1));
 				bfs.add((tx-1)*w+(i-1));
 			}
 			
 			for(int i = ty-1;i>=Math.max(ty-k,1);i--){
 				if (c[tx][i] == '@')
 					break;
 				if (dp[tx][i] != 0 )
 					break;

 				adds.add((tx-1)*w+(i-1));
 				bfs.add((tx-1)*w+(i-1));
 			}
 			
 			for(int i : adds){
 				int r1 = i/w+1;
 				int c1 = i%w+1;
 				
 				dp[r1][c1] = dp[tx][ty]+1;
 			}
 		}
 		out.println(dp[x2][y2]-1);
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
public static PrintWriter out;
	
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}