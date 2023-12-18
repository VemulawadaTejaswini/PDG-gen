import java.util.*;

class Main {
	
	public static int[] solve (int[] p, int[] w, int lim) {
		
		int maxP = 0, sum = 0;
		int[][] dp = new int[w.length + 1][lim + 1];
		
		for (int[] d : dp)
			Arrays.fill(d, -1);
		
		dp[0][0] = 0;
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < lim + 1; j++) {
				if (dp[i][j] == -1) continue;
				dp[i + 1][j] = Math.max(dp[i][j],dp[i + 1][j]);
				if (j + w[i] < lim + 1) {
					dp[i + 1][j + w[i]] = Math.max(dp[i + 1][j + w[i]], dp[i][j] + p[i]);
				}
			}
		}
		
		for (int j = 0; j < lim + 1; j++) {
			if (maxP < dp[w.length][j]) {
				maxP = dp[w.length][j];
				sum = j;
			}
		}
		return new int[]{maxP,sum};
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			int w = Integer.parseInt(sc.nextLine());
			if (w == 0) break;
			int n = Integer.parseInt(sc.nextLine());
			int[] price = new int[n];
			int[] weight = new int[n];
			for (int i = 0; i < n; i++) {
				String[] str = sc.nextLine().split(",");
				price[i] = Integer.parseInt(str[0]);
				weight[i] = Integer.parseInt(str[1]);
			}
			int[] ans = solve(price,weight,w);
			System.out.println(ans[0] + "\n" + ans[1]);
			
		}
		
	}
	
}