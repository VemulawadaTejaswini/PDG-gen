import java.util.Scanner;

/**
 * https://abc072.contest.atcoder.jp/tasks/arc082_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int MAX = 100000;
		int[] dp = new int[MAX+1];
		for(int i=0; i<N; i++){
			dp[sc.nextInt()]++;
		}
		sc.close();
		
		int ans = 0;
		for(int i=1; i<MAX; i++){
			ans = Math.max(ans, dp[i-1]+dp[i]+dp[i+1]);
		}
		System.out.println(ans);

	}

}