import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			StringTokenizer tok = new StringTokenizer(br.readLine());
			final int h = Integer.parseInt(tok.nextToken());
			final int w = Integer.parseInt(tok.nextToken());
			final int n = Integer.parseInt(tok.nextToken());
			
			if(h == 0 && w == 0 && n == 0){
				break;
			}
			
			boolean[][] map = new boolean[h][w];
			
			for(int i = 0; i < h; i++){
				StringTokenizer tok2 = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < w; j++){
					map[i][j] = tok2.nextToken().equals("1");
				}
			}
			
			int[][] dp = new int[h][w];
			dp[0][0] = n - 1;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(dp[i][j] % 2 == 0){
						if(i != h-1){
							dp[i+1][j] = dp[i][j] / 2;
						}
						if(j != w-1){
							dp[i][j+1] = dp[i][j] / 2;
						}
					}else{
						if(i != h-1){
							dp[i+1][j] = dp[i][j] / 2 + (map[i][j] ? 0 : 1);
						}
						if(j != w-1){
							dp[i][j+1] = dp[i][j] / 2 + (map[i][j] ? 1 : 0);
						}
					}
				}
			}
			
			
			int cur_x = 0;
			int cur_y = 0;
			
			while(cur_x != w && cur_y != h){
				if(dp[cur_y][cur_x] % 2 == 0){
					int n_x, n_y;
					n_x = cur_x + (map[cur_y][cur_x] ? 1 : 0);
					n_y = cur_y + (map[cur_y][cur_x] ? 0 : 1);
					cur_x = n_x;
					cur_y = n_y;
				}else{
					int n_x, n_y;
					n_x = cur_x + (map[cur_y][cur_x] ? 0 : 1);
					n_y = cur_y + (map[cur_y][cur_x] ? 1 : 0);
					cur_x = n_x;
					cur_y = n_y;
				}
			}
			
			System.out.println((cur_y + 1) + " " + (cur_x + 1));
		}
		
	}

}