import java.util.*;

public class Main {
	Scanner sc;
	boolean[] dp;
	int[] cost;
	int budget;
	int n;
	
	boolean isPrime(int x) {
		for(int i=2;i*i<x;i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	
	int solve() {
		for(int i=0;i<budget+1;i++) {
			if(dp[i]) for(int j=0;j<n;j++) 
				if(i+cost[j] <= budget)dp[i+cost[j]] = true;
		}
		int ans=-1;
		for(int i=0;i<budget+1;i++) {
			if(dp[i] && isPrime(i) ) ans = i;
		}
		return ans;
	}
	
	void run() {
		sc = new Scanner(System.in);
		
		while (true) {
			n = sc.nextInt();
			budget = sc.nextInt();
			 cost = new int[n];
			for (int i=0;i<n;i++) cost[i] = sc.nextInt();
			dp = new boolean [budget+1];
			for (int i=0;i<budget+1;i++) dp[i] = false;
			dp[0] = true;
			int ans = solve();
			if(ans <= 0) System.out.println("NA");
			else System.out.println(ans);
			
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}