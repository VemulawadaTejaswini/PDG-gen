import java.util.*;
import java.io.*;

public class Main extends Template{
	public void solve() throws IOException{
		Random rand = new Random();
		int n = nextInt();
		char[][] judge = new char[n+1][n+1];
		for(int i = 0; i < n; i++){
			String str = nextToken();
			for(int j = 0; j < str.length(); j++){
				judge[i+1][j+1] = str.charAt(j);
			}
		}
		int hand = 1;
		int count = 1000-n*n;
		int[] trend = new int[n*n];
		for(int i = 0; i < n*n; i++){
			System.out.println(hand);
			trend[i] = nextInt();
		}
		for(int i = 0 ;i < count ; i++){
			System.out.println(trend[i%(n*n)]);
			int ai_hand = nextInt();
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
}

abstract class Template implements Runnable{
	public abstract void solve() throws IOException;
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run(){
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}
	
	public double nextDouble() throws IOException{
		return Double.parseDouble(nextToken());
	}
	
	public long nextLong() throws IOException{
		return Long.parseLong(nextToken());
	}
	
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}
		