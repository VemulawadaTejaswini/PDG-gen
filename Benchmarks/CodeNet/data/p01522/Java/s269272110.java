import java.util.*;
import java.io.*;

public class Main extends Template{
	public void solve() throws IOException{
		int n = nextInt();
		int k = nextInt();
		int[] rabbit = new int[n+1];
		for(int i = 0; i < k; i++){
			int num = nextInt();
			for(int j = 0; j < num; j++){
				rabbit[nextInt()]= i;
			}
		}
		int count = 0;
		int r = nextInt();
		boolean[] check = new boolean[n+1];
		for(int i = 0; i < r; i++){
			int x = nextInt();
			int y = nextInt();
			if( rabbit[x] == rabbit[y] ){
				check[x] = true;
				check[y] = true;
			}
		}
		for(int i = 1; i <= n; i++){
			if( check[i] ){
				count++;
			}
		}
		System.out.println(count);
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
		