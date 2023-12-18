import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			int s = nextInt();
			writer.println("Case " + (i+1) + ":");
			int repeat = 10;
			while( repeat-- > 0 ){
				s = s*s;
				StringBuilder sb = new StringBuilder(Integer.toString(s));
				sb.reverse();
				int l = 8-sb.length();
				while( l-- > 0 ){
					sb.append(0);
				}
				sb.reverse();
				s = Integer.parseInt(sb.substring(2, 6));
				writer.println(s);
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