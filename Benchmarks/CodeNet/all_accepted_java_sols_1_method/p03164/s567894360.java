import java.util.Scanner;

public class Main {
	static long INF = 10_000_000_000L;
	static int Max_N=110;
	static int Max_V=100100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long W = Integer.parseInt(sc.next());
		long[] weight = new long [Max_N];
		long[] value = new long[Max_N];
		long[][] dp = new long[Max_N][Max_V];

		for (int i = 0; i < n; i++) {
			weight[i] = Long.parseLong(sc.next());
			value[i] = Long.parseLong(sc.next());
		}
		sc.close();
	    // 初期化
		for (int i = 0; i < Max_N; i++) {
			for (int j = 0; j < Max_V; j++) {
				dp[i][j] = INF;
			}
		}
	    // 初期条件
	    dp[0][0] = 0;

		for (int i = 0; i < n; i++) {
	        for (int sum_v = 0; sum_v < Max_V; sum_v++) {
	            // i 番目の品物を選ぶ場合
	            if (sum_v - value[i] >= 0) {
	                dp[i+1][sum_v]=Math.min(dp[i+1][sum_v], dp[i][(int) (sum_v - value[i])] + weight[i]);
	            }
	            // i 番目の品物を選ばない場合
	            dp[i+1][sum_v] = Math.min(dp[i+1][sum_v], dp[i][sum_v]);
	        }
	    }
		long res = 0;
		for(int sum_v=0;sum_v<Max_V;sum_v++) {
			if(dp[n][sum_v]<=W)res=sum_v;
		}
		System.out.println(res);
	}

}