import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException {
		int h, w;
		while( (h = nextInt()) != 0 | (w = nextInt()) != 0 ){
			char[][] rect = new char[h][w];
			for(int i = 0; i < h; i++){
				rect[i] = nextToken().toCharArray();
			}
			int[][] data = new int[h+2][w+2];
			for(int i = 1; i <= h; i++){
				for(int j = 1; j <= w; j++){
					if( rect[i-1][j-1] == '.' ){
						data[i][j] = data[i][j-1] + 1;
					}
				}
			}		
			int max = 0;
			for(int i = 1; i <= w; i++){
				int[] count = new int[w+1];
				int min = w+1;
				for(int j = 1; j <= h; j++){
					if( data[j][i] > 0 ){
						for(int k = 1; k <= data[j][i]; k++){
							count[k]++;			
					/*		if( count[k]*k > max ){
								writer.print(count[k]*k + " at " + j + ", " + i + ", " + k + "  ");
							}				*/
							max = Math.max(count[k]*k, max);
						}
						for(int k = data[j][i]+1; k <= w; k++){
							if( count[k] == 0 ){
								break;
							}
							count[k] = 0;
						} 						
					} else {
						for(int k = 1; k <= w; k++){
							if( count[k] == 0 ){
								break;
							}
							count[k] = 0;
						}
					}
				}						
			}		
		//	writer.println();	
			writer.println(max);			
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