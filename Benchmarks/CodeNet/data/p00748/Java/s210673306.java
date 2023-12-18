import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int MAX = 1000000;
	public static void main(String[] args) {
		doIt();
	}
	
	static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[200];
		int[] ary2 = new int[200];
		int[] dp = new int[MAX + 1];
		int[] dp2 = new int[MAX + 1];
		int p = 1;
		for(int i = 1; i < 200; i++){
			ary[i] = i * (i + 1) * (i + 2) / 6;
			if(ary[i] % 2 == 1){
				ary2[p] = ary[i];
				p++;
			}
		}
		solve(MAX, ary, dp);
		solve(MAX, ary2, dp2);
		while(0 < n){
			System.out.println(dp[n] + " " + dp2[n]);
			n = sc.nextInt();
		}
	}
	static int solve(int n, int[] ary, int[] dp){
		//int[] dp = new int[n + 1];
		Arrays.fill(dp, 1000000);
		dp[0] = 0;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j < ary.length; j++)
				if(i < ary[j]) break;
				else if(dp[i - ary[j]] + 1 < dp[i]) dp[i] = dp[i - ary[j]] + 1;
		}
		return dp[n];
	}

}