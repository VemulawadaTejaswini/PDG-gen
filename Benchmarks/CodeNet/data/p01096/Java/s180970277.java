import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n==0)break;

			int[] arr = new int[n];
			for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
			int[][] dp = new int[n][n];

			for(int interval = 1; interval<n; interval += 2) {
				for(int start = 0; start+interval<n; start++) {
					//dp[start][start+interval]

					if(Math.abs(arr[start]-arr[start+interval])<2) {
						if(dp[start+1][start+interval-1]==interval-1) {
							dp[start][start+interval] = interval+1;
							continue;
						}
					}

					for(int innerInterval = 1; innerInterval<interval-1; innerInterval+=2) {
						//System.out.println(start+","+interval+","+innerInterval);
						dp[start][start+interval] = Math.max(
							(
								dp[start][start+interval]
							),
							(
								dp[start][start+innerInterval] +
								dp[start+innerInterval+1][start+interval]
							)
						);
					}
				}
			}

			int result = 0;
			for(int i = 0; i < dp.length; i++) {
				for(int j = 0; j < dp[i].length; j++) {
					//System.out.printf("%3d",dp[i][j]);
					result = Math.max(result,dp[i][j]);
				}
				//System.out.println();
			}
			System.out.println(result);
		}
	}
}