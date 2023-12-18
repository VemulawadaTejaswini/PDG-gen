import java.util.*;
import java.io.*;

public class Main {
	
	public long[] sumUp(int[][] card){
		long[] dp = new long[10001];
		dp[0] = 1;
		for(int i = 0; i < card.length; i++){
			long[] temp = new long[10001];
			for(int j = 10000; j >= 0; j--){
				if( dp[j] > 0 ){
					int k = card[i][1];
					while( k > 0 ){
					//	writer.print((j+card[i][0]*k) + " ");
						temp[j+card[i][0]*k] += dp[j];
						k--;
					}					
				}
			}
			for(int j = 0; j < 10001; j++){
				dp[j] += temp[j];
			}
		}
		return dp;
	}
	public  void solve() throws IOException{
		int n;
		while( (n = nextInt()) != 0 ){
			int[][] card = new int[n][2];
			for(int i = 0; i < n; i++){
				card[i][0] = nextInt();
				card[i][1] = nextInt();
			}			
			long[] check = sumUp(card);
			int m = nextInt();
			for(int i = 0; i < m; i++){
				int x = nextInt();
				writer.println(check[x]);
			}
		}
		writer.flush();
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