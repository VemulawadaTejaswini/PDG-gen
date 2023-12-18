import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
		static int n;
		static int[] A;
		static int q;
		static int m;
		
		static int[][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		
		n = Integer.parseInt(br.readLine());
		A = new int[n];
		
		str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		q = Integer.parseInt(br.readLine());
		
		str = br.readLine().split(" ");
		for(int i = 0; i < q; i++){
			m = Integer.parseInt(str[i]);
			
			dp = new int[n][m + 2000];
			for(int[] array : dp){
				Arrays.fill(array, -1);
			}
			
			System.out.println(dfs(0, 0) == 1?"yes" : "no");
		}
		
	}
	
	public static int dfs(int i, int sum){
		
		if(sum == m) return 1;
		
		else if(i == n) return 0;
		
		else if(dp[i][sum] != -1) return dp[i][sum];
		
		else if(dfs(i + 1, sum) == 1) return dp[i][sum] = 1;
		
		else if(dfs(i + 1, sum + A[i]) == 1) return dp[i][sum] = 1;
		
		else return dp[i][sum] = 0;
	}
}
