import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			String[] s = nextToken().split(":");
			int[] hand = new int[2];
			hand[0] = Integer.parseInt(s[0]);
			hand[1] = Integer.parseInt(s[1]);
			double key = Math.abs(hand[1]*6 - (hand[0]*30 + (double)hand[1]/2));
			key = Math.min(key, 360-key);
			if( key < 30 ){
				writer.println("alert");
			} else if( key < 90 ){
				writer.println("warning");
			} else {
				writer.println("safe");
			}
			writer.flush();
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
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}