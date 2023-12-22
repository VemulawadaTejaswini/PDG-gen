
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		
		tmpArray = br.readLine().split(" ");
		int r = Integer.parseInt(tmpArray[0]);
		int s = Integer.parseInt(tmpArray[1]);
		int p = Integer.parseInt(tmpArray[2]);
		
		String input = br.readLine();
		
		int[][] dp = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			char tmpC = input.charAt(i);
			
			int tmpMax = 0;
			if(i >= 1) {
				for(int j = 0; j < 3; j++) {
					tmpMax = Math.max(tmpMax, dp[i - 1][j]);
				}
			}
			Arrays.fill(dp[i], tmpMax);
			
			if(tmpC == 'r') {
				dp[i][2] += p;
				if(i >= k && dp[i - k][2] > dp[i - k][0] && dp[i - k][2] > dp[i - k][1]) {
					dp[i][2] -= p;
				}
			}
			else if(tmpC == 's') {
				dp[i][0] += r;
				if(i >= k && dp[i - k][0] > dp[i - k][1] && dp[i - k][0] > dp[i - k][2]) {
					dp[i][0] -= r;
				}
			}
			else {
				dp[i][1] += s;
				if(i >= k && dp[i - k][1] > dp[i - k][0] && dp[i - k][1] > dp[i - k][2]) {
					dp[i][1] -= s;
				}
			}
			
		}
		
		System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
	}
}
