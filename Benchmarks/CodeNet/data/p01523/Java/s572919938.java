import java.util.*;
import java.io.*;

public class Main extends Template{
	public void solve() throws IOException{
		int n = nextInt();
		int m = nextInt();
		int[][] power = new int[m][2];
		for(int i = 0; i < m; i++){
			power[i][0] = nextInt();
			power[i][1] = nextInt();
		}
		boolean[] guard = new boolean[n+1];
		int count = 0;
		for(int i = 1; i <= n; i++){
			if( !guard[i] ){
				count++;
				int max = 0;
				int index = -1;
				for(int j = 0; j < power.length; j++){
					if( power[j][0] <= i && power[j][1] >= i ){
						if( power[j][1] - i + 1 > max ){
							max = power[j][1] - i + 1;
							index = j;
						}
					}
				}
				if( index == -1 ){
					System.out.println("Impossible");
					return;
				} else {
					for(int j = power[index][0]; j <= power[index][1]; j++){
						guard[j] = true;
					}
				}
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
		