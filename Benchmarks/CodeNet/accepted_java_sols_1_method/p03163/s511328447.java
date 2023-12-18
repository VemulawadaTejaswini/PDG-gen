import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		long[] weight = new long [110];
		long[] value = new long[110];
		long[][] dp = new long[110][100100];

		for (int i = 0; i < n; i++) {
			weight[i] = Long.parseLong(sc.next());
			value[i] = Long.parseLong(sc.next());
		}
		sc.close();

		for (int i = 0; i < n; i++) {
	        for (int sum_w = 0; sum_w <= W; sum_w++) {
	            // i 番目の品物を選ぶ場合
	            if (sum_w - weight[i] >= 0) {
	                dp[i+1][sum_w]=Math.max(dp[i+1][sum_w], dp[i][(int) (sum_w - weight[i])] + value[i]);
	            }
	            // i 番目の品物を選ばない場合
	            dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w]);
	        }
	    }
		System.out.println(dp[n][W]);
	}

}
