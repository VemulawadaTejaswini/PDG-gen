import java.util.*;


public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true){
				int n = sc.nextInt();

				if(n==0){
					sc.close();
					break;
				}
				
				int[][] t = new int[n][n+1];
				for (int i=0;i<n;i++){
					for (int j=0;j<=n;j++){
						t[i][j] = sc.nextInt();
					}
				}
				int[] dp = new int[1<<n];
				Arrays.fill(dp,Integer.MAX_VALUE);
				dp[0] = 0;
				
				for (int bit=0;bit<1<<n;bit++){
					for (int i=0;i<n;i++){
						if ((bit & (1<<i)) != 0){
							continue;
						}
						int cost = t[i][0];
						for (int j=0;j<n;j++){
							if ((bit & (1<<j)) == 0){
								continue;
							}
							cost = Math.min(cost, t[i][j+1]);
						}
						int k = bit | (1 << i);
						dp[k] = Math.min(dp[k],dp[bit] + cost);
					}
				}
				System.out.println(dp[(1<<n) - 1]);
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}