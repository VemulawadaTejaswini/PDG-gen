import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int n = Integer.valueOf(reader.readLine());
		int m = Integer.valueOf(reader.readLine());
		
		int cost[][] = new int[n][n];
		for(int i = 0; i < n; i++){ Arrays.fill(cost[i], 1 << 29); }
		for(int i = 0; i < m; i++){
			String str[] = reader.readLine().split(",");
			int a = Integer.valueOf(str[0]) - 1;
			int b = Integer.valueOf(str[1]) - 1;
			cost[a][b] = Integer.valueOf(str[2]);
			cost[b][a] = Integer.valueOf(str[3]);
		}
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
				}
			}
		}
		String str[] = reader.readLine().split(",");
		int a = Integer.valueOf(str[0]) - 1;
		int b = Integer.valueOf(str[1]) - 1;
		int c = Integer.valueOf(str[2]);
		int d = Integer.valueOf(str[3]);
		System.out.println(c - d - cost[a][b] - cost[b][a]);
	}
}