import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int h[] = new int[N];

		for(int n=0;n<N;n++){
			h[n] = sc.nextInt();
		}

		int dp[] = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(h[1]-h[0]);
		for(int n=2;n<N;n++){
			dp[n] = Math.min(dp[n-1]+Math.abs(h[n]-h[n-1]),dp[n-2]+Math.abs(h[n]-h[n-2]));
		}

		System.out.println(dp[N-1]);

	}
}