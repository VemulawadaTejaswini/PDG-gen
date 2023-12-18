import java.util.Scanner;


class Main{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++){
			for(int j = 1; j <= 10; j++){
				ball[j] = in.nextInt();
			}
			System.out.println(solve(ball));
		}
		in.close();
	}
	
//	private static String solve(int[] ball){
//		int[] dp = new int[ball.length];
//		
//		int max = 0;
//		for (int i = 0; i < ball.length; i++){
//			dp[i] = 1;
//			for (int j = 0; j < i; j++){
//				if (ball[i] <= ball[j]){
//					dp[i] = Math.max(dp[i], dp[j]+1);
//				}
//				max = Math.max(max, dp[i]);
//			}
//		}
//		return max <= 2 ? "YES":"NO";
//	}
	
	static int kase;
	static int[] ball = new int[15];
	static int[] l = new int[15];
	static int[] r = new int[15];
	private static String solve(int[] ball){
		kase = 0;
		dfs(1, 1, 1);
		return kase == 1 ? "YES" : "NO";
	}
	
	private static void dfs(int i, int j, int k){
		if (i > 10){
			kase = 1;
			return;
		}
		if (kase == 1) return;
		if (ball[i] > l[j-1]){
			l[j] = ball[j];
			dfs(i+1, j+1, k);
		}
		if (ball[i] > r[k-1]){
			r[k] = ball[i];
			dfs(i+1, j, k+1);
		}
	}
}