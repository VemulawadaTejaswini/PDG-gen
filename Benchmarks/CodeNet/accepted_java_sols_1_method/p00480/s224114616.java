import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int[] data;
		long[][] dp;
		while(sc.hasNext()){
			n = sc.nextInt();
			data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			dp = new long[n - 1][21];
			dp[0][data[0]] = 1;
			for(int i = 1; i < n - 1; i++){
				for(int j = 0; j <= 20; j++){
					if(j + data[i] <= 20){
						dp[i][j] += dp[i - 1][j + data[i]];
					}
					if(j - data[i] >= 0){
						dp[i][j] += dp[i - 1][j - data[i]];
					}
				}
			}
			System.out.println(dp[n - 2][data[n - 1]]);
		}
	}
}