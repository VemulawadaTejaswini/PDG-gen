package practice_problems_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	char[][] map;
	int height;
	int width;
	class Pair {
		int x, y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString(){
			return "(" + x + ", " + y + ")";
		}
	}
	public void bfs(boolean[][] used, int h, int w){
		Queue<Pair> queue = new ArrayDeque<Pair>();
		queue.add(new Pair(w, h));
		while( queue.size() > 0 ){
			Pair p = queue.poll();
			for(int i = -1; i <= 1; i++){
				for(int j = -1; j <= 1; j++){
					if( i*j != 0 || (i == 0 && j == 0) ){
						continue;
					}
					int x = p.x+j;
					int y = p.y+i;
					if( x < 0 || x >= width || y < 0 || y >= height ){
						continue;
					}
					if( used[y][x] || (map[y][x] != map[h][w]) ){
						continue;
					}
					used[y][x] = true;
					queue.add(new Pair(x, y));
				}
			}
		//	System.out.println(queue);
		}
	}
	public void dfs(boolean[][] used, int h, int w){
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if( i*j != 0 || (i==0 && j==0) ){
					continue;
				}
				int x = w+j;
				int y = h+i;
				if( x < 0 || x >= width || y < 0 || y >= height ){
					continue;
				}
				if( used[y][x] || (map[h][w] != map[y][x]) ){
					continue;
				}
				used[y][x] = true;
				dfs(used, y, x);
			}
		}
	}
	public void solve() throws IOException {
		height = 0;
		width = 0;
		while( true ){
			height = nextInt();
			width = nextInt();
			if( height == 0 && width == 0 ){
				break;
			}
			map = new char[height][width];
			for(int i = 0; i < height; i++){
				map[i] = nextToken().toCharArray();
			}
			boolean[][] used = new boolean[height][width];
			int ans = 0;
			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					if( !used[i][j] ){
						ans++;
						used[i][j] = true;
						bfs(used, i, j);
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