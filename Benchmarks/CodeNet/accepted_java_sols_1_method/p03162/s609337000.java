import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int [][]v = new int[n][3];
		for(int i = 0; i < n; i++) {
			v[i][0] = sc.nextInt();
			v[i][1] = sc.nextInt();
			v[i][2] = sc.nextInt();
		}
		int [][]dp = new int[n][3];
		int i;
		dp[0][0] = v[0][0];
	    dp[0][1] = v[0][1];
	    dp[0][2] = v[0][2];
	    for(i = 1; i < n; i++){
	        dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + v[i][0];
	        dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + v[i][1];
	        dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + v[i][2];
	    }
	    System.out.println(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
	}

}
