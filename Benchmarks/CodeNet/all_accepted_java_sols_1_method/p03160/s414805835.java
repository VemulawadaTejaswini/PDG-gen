import java.util.Scanner;

public class Main {
	static int dp[];//dp[i] i番にいるとき最小コスト
	static int N;
	static int[]h;


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		h=new int[N];
		dp=new int[N];

		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		dp[N-1]=0;
		dp[N-2]=Math.abs( h[N-1]-h[N-2]);
		for(int i=N-3;i>=0;i--) {
			dp[i]=Math.min(
					Math.abs( h[i]-h[i+1])+dp[i+1],
					Math.abs( h[i]-h[i+2])+dp[i+2]
					);
		}

		System.out.println(dp[0]);
	}
}