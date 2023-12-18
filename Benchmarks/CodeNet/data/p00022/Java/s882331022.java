import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[][]dp;
	static int []v;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		dp = new int[n + 1][n + 1];
		v = new int[n + 1];
		for(int i = 1; i <= n; i++)
			v[i] = sc.nextInt();
		return true;
	}
	static void solve(){
		dp[1][1] = v[1];
		for(int j = 1; j < n; j++)
			dp[1][j + 1] =dp[1][j] + v[j + 1];
		for(int i = 1; i < n; i++){
			for(int j = 1; j < n + 1; j++){
				dp[i + 1][j] = dp[i][j] - v[i];
			}
		}
		int max = 0;
		for(int i = 1; i < n + 1; i++){
			for(int j = 1; j < n + 1; j++){
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}
}