import java.util.Scanner;
 
public class Main {
 
	static final int INF = Integer.MAX_VALUE;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
			int N = Integer.parseInt(scan.next());
			int K = Integer.parseInt(scan.next());
			int[] h = new int[N];
			int[] dp = new int[N];
 
			for(int i=0; i<N; i++) {
				h[i] = Integer.parseInt(scan.next());
				dp[i] = INF;
			}
 
			dp[0] = 0;
			dp[1] = Math.abs(h[1] - h[0]);
 
			for(int i=2; i<N; i++) {
				for(int j=1; j<=K; j++) {
                  if(i-j < 0){ continue;}
					dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
				}
			}
			System.out.println(dp[N-1]);
		}
	}
 
}