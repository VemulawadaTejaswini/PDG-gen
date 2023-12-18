import java.util.*;
import java.io.*;

public class Main {
	
	public int calculate(char[][] map){
		int n = map.length;
		int m = map[0].length;
		int counter = 0;
		for(int i = 1; i < map.length-1; i++){
			for(int j = 1; j < map[0].length-1; j++){
				if( map[i][j] == '.' ){
					continue;
				}
				counter++;
				char key = map[i][j];
				Set<Integer> set = new HashSet<Integer>();
				Set<Integer> next = new HashSet<Integer>();
				next.add(i*n+j);
				while( next.size() != 0 ){
					for(Integer x : next){
						set.add(x);
					}
					next.clear();
					for(Integer x : set){
						int a = x/n;
						int b = x%n;
						if( map[a+1][b] == key && !set.contains((a+1)*n+b) ){
							next.add((a+1)*n+b);
						}
						if( map[a-1][b] == key && !set.contains((a-1)*n+b) ){
							next.add((a-1)*n+b);
						}
						if( map[a][b+1] == key && !set.contains(a*n+b+1) ){
							next.add((a*n+b+1));
						}
						if( map[a][b-1] == key && !set.contains(a*n+b-1) ){
							next.add((a*n+b-1));
						}
					}
				}
				for(Integer x : set){
					int a = x/n;
					int b = x%n;
					map[a][b] = '.';
				}
			}
		}
		return counter;
	}
	public void solve() throws IOException {
		int n, m;
		while( (n = nextInt()) != 0 | (m = nextInt()) != 0 ){
			String[] temp = new String[n];
			for(int i = 0; i < n; i++){
				temp[i] = nextToken();
			}			
			char[][] map = new char[n+2][m+2];
			for(int i = 0; i < map.length; i++){
				map[i][0] = '.';
				map[i][map[0].length-1] = '.';
			}
			for(int i = 0; i < map[0].length; i++){
				map[0][i] = '.';
					map[map.length-1][i] = '.';
			}
			for(int i = 1; i < map.length-1; i++){
				for(int j = 1; j < map[0].length-1; j++){
					map[i][j] = temp[i-1].charAt(j-1);
				}
			}
			System.out.println(calculate(map));
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