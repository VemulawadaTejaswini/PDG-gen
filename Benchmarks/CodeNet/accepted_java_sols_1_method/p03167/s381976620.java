import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int MOD = 1000000007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int H = Integer.parseInt(S[0]);
		int W = Integer.parseInt(S[1]);
		
		String[] square= new String[H+1];
		
		for(int i = 1; i <= H; i++) {
			square[i] = br.readLine();
		}
		
		int[][] paths = new int[H+1][W+1];
		
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				if(i == 1 && j == 1) {
					paths[i][j] = 1;
				} else if(square[i].charAt(j-1) != '#') {
					paths[i][j] = (paths[i-1][j] + paths[i][j-1]) % MOD;
				}
			}
		}
		
		System.out.println(paths[H][W]);
	}
}
