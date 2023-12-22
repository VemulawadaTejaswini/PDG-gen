import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		Main ans = new Main();
		System.out.println(ans.solve());
		
	}

	private int solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int []array = new int[N+1];
		for(int i=1;i<=N;i++){
			array[i] = sc.nextInt();
		}

		int [] dp = new int[N+1];

		dp[1] =0;

		for(int i=2;i<=N;i++){
			dp[i] = Integer.MAX_VALUE;
			for(int j=i-1;j>=1 && i-j<=K;j--) {
				dp[i] = Math.min(dp[i], Math.abs(array[i]-array[j])+dp[j]);
			}
		} 

		return dp[N];
		 
	}


}