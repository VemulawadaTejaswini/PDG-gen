import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException {
		char[][] data = new char[8][];
		for(int i = 0; i < 8; i++){
			data[i] = nextToken().toCharArray();
		}
		writer.println(90);
		for(int i = 0; i < 8; i++){
			for(int j = 7; j >= 0; j--){
				writer.print(data[j][i]);
			}
			writer.println();
		}
		writer.println(180);
		for(int i = 7; i >= 0; i--){
			for(int j = 7; j >= 0; j--){
				writer.print(data[i][j]);
			}
			writer.println();
		}
		writer.println(270);
		for(int i = 7; i >= 0; i--){
			for(int j = 0; j < 8; j++){
				writer.print(data[j][i]);
			}
			writer.println();
		}
		writer.flush();
	}
	public static void main (String args[]) throws IOException {
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