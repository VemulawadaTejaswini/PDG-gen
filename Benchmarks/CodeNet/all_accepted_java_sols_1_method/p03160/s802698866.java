import java.util.*; import java.io.*; import java.math.*;


class Main {
	
	static Scanner scan = new Scanner(System.in);
	static int lim = 1000000007;
	static long[] dp; 
	public static void main(String[] args) {
		int t = 1;
		while(t-->0) {
			int N = scan.nextInt(); long[] arr = new long[N]; dp = new long[N];
			for(int i=0; i<N; i++) {arr[i] = scan.nextLong(); } Arrays.fill(dp,0);
			dp[N-1] = 0; dp[N-2] = Math.abs(arr[N-1]-arr[N-2]);
			for(int i=N-3; i>=0; i--) {
				dp[i] = Math.min(dp[i+1]+Math.abs(arr[i]-arr[i+1]), dp[i+2]+Math.abs(arr[i]-arr[i+2]));
			}
			
			System.out.println(dp[0]);
			
		}
		 
	}
	
	
	

}
