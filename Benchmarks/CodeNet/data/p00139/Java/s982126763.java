import java.util.*;
import java.io.*;

public class Main {
	
	public String species(String snake){
		if( snake.length() < 5 || snake.charAt(0) != '>' || snake.charAt(snake.length()-1) != '~' ){
			return "NA";
		}
		if( snake.charAt(1) == '\'' ){
			int count = 0;
			boolean flag = true;
			for(int i = 2; i < snake.length()-1; i++){
				if( flag ){
					if( snake.charAt(i) == '=' ){
						count++;
					} else if( snake.charAt(i) == '#' ){
						flag = false;
					} else {
						return "NA";
					}
				} else {
					if( snake.charAt(i) == '=' ){
						count--;						
					} else {
						return "NA";
					}
				}
			}
			if( count != 0 ){
				return "NA";
			}
			return "A";
		} else if( snake.charAt(1) == '^' ){
			for(int i = 2; i < snake.length()-2; i += 2){
				if( snake.charAt(i) == 'Q' && snake.charAt(i+1) == '=' ){
					continue;
				}
				return "NA";
			}
			if( snake.charAt(snake.length()-2) != '~' ){
				return "NA";
			}
			return "B";
		}
		return "NA";
	}
	public void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			String snake = nextToken();
			writer.println(species(snake));
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