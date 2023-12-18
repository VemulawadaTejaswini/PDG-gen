import java.util.*;
import java.io.*;

public class Main {
	
	public void change(int[] d){
		if( d[0] == -1 ){
			d[0] = 0;
			d[1] = 1;
		} else if( d[0] == 0 ){
			if( d[1] == 1 ){
				d[0] = 1;
				d[1] = 0;
			} else {
				d[0] = -1;
				d[1] = 0;
			}
		} else {
			d[0] = 0;
			d[1] = -1;
		}
	}
	public void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			int length = nextInt();
			if( length == 1 ){
				writer.println('#');
				continue;
			}
			char[][] ans = new char[length+2][length+2];
			for(int j = 0; j < ans.length; j++){
				for(int k = 0; k < ans.length; k++){
					ans[j][k] = ' ';
				}
			}
			int[] point = new int[2];
			point[0] = length; point[1] = 1;
			int[] dir = new int[2];
			dir[0] = -1; dir[1] = 0;
			int count = 1;
			int repeat = 30;
			while(true){
				if( point[0]+dir[0] > length || point[0]+dir[0] < 1 || point[1]+dir[1] > length || point[1]+dir[1] < 1 ){
					change(dir);
					count = 0;
					if( ans[point[0]+2*dir[0]][point[1]+2*dir[1]] == '#' ){
						ans[point[0]][point[1]] = '#';
						break;
					}
					continue;
				}
				int x = point[0]+dir[0];
				int y = point[1]+dir[1];
				if( ans[x][y] == '#' ){
					if( count < 3 ){
						break;
					}
					point[0] -= dir[0];
					point[1] -= dir[1];
					count = 0;
					change(dir);
					if( ans[point[0]+2*dir[0]][point[1]+2*dir[1]] == '#' ){
						break;
					}
				}
				ans[point[0]][point[1]] = '#';
				point[0] += dir[0];
				point[1] += dir[1];
				count++;
			}
			for(int j = 1; j <= length; j++){
				for(int k = 1; k <= length; k++){
					writer.print(ans[j][k]);
				}
				writer.println();
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