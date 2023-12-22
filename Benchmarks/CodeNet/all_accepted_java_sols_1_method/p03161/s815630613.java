import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int inf=400000000;
		int[] dp=new int[n],h=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
			dp[i]=inf;
		}
		dp[0]=0;
		for(int i=1;i<n;i++) {
			dp[i]=dp[i-1]+Math.abs(h[i]-h[i-1]);
			for(int j=1;j<=i&&j<=k;j++) {
				int cost=dp[i-j]+Math.abs(h[i]-h[i-j]);
				dp[i]=Math.min(dp[i],cost);
			}
		}
		System.out.println(dp[n-1]);
		sc.close();
	}
}