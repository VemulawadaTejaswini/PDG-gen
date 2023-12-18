import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double a[]=new double[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextDouble();
		}
		double dp[][]=new double[n+1][n+1];
		dp[0][0]=1;
		double count=0;
		for(int h=0;h<=n;h++)
		for(int t=0;t<=n;t++){
			if(h+t>n)
			continue;
			if(h>0){
				dp[h][t]+=dp[h-1][t]*a[h+t-1];
			}
			if(t>0){
				dp[h][t]+=dp[h][t-1]*(1-a[h+t-1]);
			}
			if(h+t==n&&h>t){
				//pw.println(h+" "+t+" "+dp[h][t]);
				count+=dp[h][t];
			}
		}
		System.out.println(count);

	}
}
