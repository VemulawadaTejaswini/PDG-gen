import java.util.*;
import java.io.*;

public class Main {
	
	public int getMax(int[][] map){
		int[][] len = new int[map.length+1][map.length];
		int max = 0;
		for(int i = 0; i < map.length; i++){
			int[] wid = new int[map.length+1];
			for(int j = 0; j < map.length; j++){
				if( map[i][j] == 1 ){
					wid[j+1] = wid[j] + 1;
					len[i+1][j] = len[i][j] + 1;
					max = Math.max(wid[j+1], max);
					max = Math.max(len[i+1][j], max);
				}
			}
		}
		if( max == map.length ){
			return max;
		}
		for(int i = max; i < map.length; i++){
			int count = 0;
			for(int j = 0; j <= i; j++){
				if( map[j][i-j] == 1 ){
					count++;
					max = Math.max(max, count);
				} else {
					count = 0;
				}
			}			
		} 
		for(int i = max; i < map.length; i++){
			int count = 0;
			for(int j = 0; j <= i; j++){
				if( map[map.length-1-i+j][map.length-1-j] == 1 ){
					count++;
					max = Math.max(max, count);
				} else {					
					count = 0;
				}
			}
		} 
		for(int i = max; i < map.length; i++){
			int count = 0;
			for(int j = 0; j <= i; j++){
				if( map[j][map.length-1-i+j] == 1 ){
					count++;
					max = Math.max(max, count);
				} else {					
					count = 0;
				}
			}			
		}
		for(int i = max; i < map.length; i++){
			int count = 0;
			for(int j = 0; j <= i; j++){
				if( map[map.length-1-j][i-j] == 1 ){
					count++;
					max = Math.max(max, count);
				} else {					
					count = 0;
				}
			}			
		}  
		return max;
	}
	public  void solve() throws IOException{
		int n;
		while( (n = nextInt() ) != 0 ){
			String[] s = new String[n];
			int[][] map = new int[n][n];
			for(int i = 0; i < n; i++){
				s[i] = nextToken();
				for(int j = 0; j < n; j++){
					map[i][j] = s[i].charAt(j)-'0';
				}
			}
			writer.println(getMax(map));			
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