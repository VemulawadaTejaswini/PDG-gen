import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public void run() {
		dp[1] = 1;
		dpK[1] = 1;
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		int m = calcDP(n);
		int mK = calcDPK(n);
		System.out.println(m + " " + mK);
	}
	int[] dp = new int[1000001];
	public int calcDP(int n){
		if(n == 0) return 0;
		else{
			int min = 10;
			for(int i = 1; i < n; i++){
				int t = i * (i + 1) * (i + 2) / 6;
				if(n - t < 0) break;
				int m;
				if(dp[n-t] != 0) m = dp[n-t] + 1;
				else m = calcDP(n - t) + 1;
				if(m < min) 
					min = m;
			}
			dp[n] = min;
			return dp[n];
		}
	}
	int[] dpK = new int[1000001];
	public int calcDPK(int n){
		if(n == 0) return 0;
		else{
			int min = 10000000;
			for(int i = 1; i < n; i++){
				int t = i * (i + 1) * (i + 2) / 6;
				if(n - t < 0) break;
				if(t % 2 == 1){
					int m;
					if(dpK[n-t] != 0) m = dpK[n-t] + 1;
					else m = calcDPK(n - t) + 1;
					if(m < min) min = m;
				}
			}
			dpK[n] = min;
			return dpK[n];
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}