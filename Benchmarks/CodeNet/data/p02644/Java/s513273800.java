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
 		
 		Queue<ArrayList<Integer>> bfs = new LinkedList<ArrayList<Integer>>();
 		ArrayList<Integer> first = new ArrayList<Integer>();
 		first.add(x1);
 		first.add(y1);
 		first.add(0);
 		bfs.add(first);
 		while(!bfs.isEmpty()){
 			ArrayList<Integer> p = bfs.remove();
 			int tx = p.get(0);
 			int ty = p.get(1);
 			int dir = p.get(2);
 			if (dir != 2){
 			for(int i = tx+1;i<=Math.min(tx+k,h);i++){
 				if (c[i][ty] == '@')
 					break;
 				if (dp[i][ty] != 0)
 					continue;
 				dp[i][ty] = dp[tx][ty]+1;
 				ArrayList<Integer> ar = new ArrayList<Integer>();
 				ar.add(i);
 				ar.add(ty);
 				ar.add(1);
 				bfs.add(ar);
 			}}
 			if (dir != 1){
 			for(int i = tx-1;i>=Math.max(tx-k,1);i--){
 				if (c[i][ty] == '@')
 					break;
 				if (dp[i][ty] != 0)
 					continue;
 				dp[i][ty] = dp[tx][ty]+1;
 				ArrayList<Integer> ar = new ArrayList<Integer>();
 				ar.add(i);
 				ar.add(ty);
 				ar.add(2);
 				bfs.add(ar);
 			}}
 			if (dir != 4){
 			for(int i = ty+1;i<=Math.min(ty+k,w);i++){
 				if (c[tx][i] == '@')
 					break;
 				if (dp[tx][i] != 0)
 					continue;
 				dp[tx][i] = dp[tx][ty]+1;
 				ArrayList<Integer> ar = new ArrayList<Integer>();
 				ar.add(tx);
 				ar.add(i);
 				ar.add(3);
 				bfs.add(ar);
 			}}
 			
 			if (dir!= 3){
 			for(int i = ty-1;i>=Math.max(ty-k,1);i--){
 				if (c[tx][i] == '@')
 					break;
 				if (dp[tx][i] != 0)
 					continue;
 				dp[tx][i] = dp[tx][ty]+1;
 				ArrayList<Integer> ar = new ArrayList<Integer>();
 				ar.add(tx);
 				ar.add(i);
 				ar.add(4);
 				bfs.add(ar);
 			}}
 		}
 		out.println(dp[x2][y2]-1);
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


