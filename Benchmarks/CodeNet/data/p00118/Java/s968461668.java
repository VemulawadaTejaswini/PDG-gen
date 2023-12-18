
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public void dfs(boolean[][] used, char[][] map, int h, int w){
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if( i*j != 0 || (i==0 && j==0) ){
					continue;
				}
				int x = w+i;
				int y = h+j;
				if( x < 0 || x >= used[0].length || y < 0 || y >= used.length ){
					continue;
				}
				if( used[y][x] || (map[h][w] != map[y][x]) ){
					continue;
				}
				used[y][x] = true;
				dfs(used, map, y, x);
			}
		}
	}
	public void solve() throws IOException {
		int h = 0, w = 0;
		while( (h = nextInt()) != 0 | (w = nextInt()) != 0 ){
			char[][] map = new char[h][w];
			for(int i = 0; i < h; i++){
				map[i] = nextToken().toCharArray();
			}
			boolean[][] used = new boolean[h][w];
			int ans = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if( !used[i][j] ){
						ans++;
						dfs(used, map, i, j);
					}
				}
			}
			writer.println(ans);
		}
		writer.flush();
	}
	public static void main(String[] args){
		new Main().run();
	}
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() {
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public String nextToken() throws IOException {
		if( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}