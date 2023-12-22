import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] candy = new int[2][n];
		int[][] dp = new int[2][n];
		
		for(int i = 0; i < 2 ; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			for(int j = 0; j < n; j++){
				candy[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}
		
		dp[0][0] = candy[0][0];
		for(int i = 1; i < n; i++){
			dp[0][i] = candy[0][i] + dp[0][i - 1];
		}
		
		dp[1][0] = dp[0][0] + candy[1][0];
		
		for(int i = 1; i < n; i++){
			dp[1][i] = Math.max(dp[1][i - 1] + candy[1][i], dp[0][i] + candy[1][i]);
		}
		
		System.out.println(dp[1][n-1]);
	}

}
