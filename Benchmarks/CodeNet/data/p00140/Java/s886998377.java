import java.util.*;
import java.io.*;

public class Main {
	
	public String result(int start, int stop){
		StringBuilder ans = new StringBuilder();
		if( start < stop ){
			for(int i = start; i <= stop; i++){
				ans.append(i + " ");
			}			
		} else {
			if( start < 6 ){
				for(int i = start; i >= stop; i--){
					ans.append(i + " ");
				}				
			} else {
				for(int i = start; i <= 9; i++){
					ans.append(i + " ");
				}
				if( stop < 6 ){
					for(int i = 5; i >= stop; i--){
						ans.append(i + " ");
					}					
				} else {
					for(int i = 5; i >= -5; i--){
						int x = Math.abs(i);
						ans.append(x + " ");
					}
					for(int i = 6; i <= stop; i++){
						ans.append(i + " ");
					}
				}
			}				
		}
		ans.deleteCharAt(ans.length()-1);
		return ans.toString();
	}
	public void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			int start = nextInt(), stop = nextInt();
			writer.println(result(start, stop));
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