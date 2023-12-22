import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		long[] dp=new long[W+1];
		int[] w=new int[n];
		long[] v=new long[n];
		for(int i = 0; i<n; i++){
			w[i] =sc.nextInt();
			v[i] = sc.nextLong();
		}
		for(int i = 0; i<n; i++){
			for(int j=W; j>=w[i]; j--){
				dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
			}
		}
		System.out.println(dp[W]);
	}
}
