import java.util.Scanner;
 
public class Main {
	static int N;
	static int W;
	static long[] w = new long[110];
	static long[] v = new long[110];
	static long[][] dp = new long[110][100100];
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		W = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		//dp[何番目の商品か][超えない重さ] = 価値の総和
		
		for(int i = 0; i < N; i++) {
			for(int sum_w = 0; sum_w <= W; sum_w++) {
				if(sum_w - w[i] >= 0) {
					//dp[i+1][sum_w] = dp[i][重さ-商品の重さ=残りの重さ] + 商品の価値 = 価値の総和
					dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][(int) (sum_w-w[i])]+v[i]);
				}
				dp[i+1][sum_w]=Math.max(dp[i+1][sum_w], dp[i][sum_w]);
			}
		}
		System.out.println(dp[N][W]);
	}
}