import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException{
		int n = nextInt();
		int[] height = new int[6];
		for(int i = 0; i < n; i++){
			double h = nextDouble();
			if( h < 165 ){
				height[0]++;
			} else {
				int index = (int)(h-165)/5 + 1;
				index = Math.min(5, index);
				height[index]++;
			}
		}
		for(int i = 0; i < 6; i++){
			writer.print((i+1) + ":");
			while( height[i]-- > 0 ){
				writer.print("*");
			}
			writer.println();
		}
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
	public double nextDouble() throws IOException{
		return Double.parseDouble(nextToken());
	}
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}