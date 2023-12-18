import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int inf=400000000;
		int[] dp=new int[n],h=new int[n];
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
			dp[i]=inf;
		}
		dp[0]=0;
		for(int i=1;i<n;i++) {
			int cost1=dp[i-1]+Math.abs(h[i]-h[i-1]);
			if(i==1) {
				dp[i]=cost1;
			}else {
				int cost2=dp[i-2]+Math.abs(h[i]-h[i-2]);
				dp[i]=Math.min(cost1,cost2);
			}
		}
		System.out.println(dp[n-1]);
		sc.close();
	}
}