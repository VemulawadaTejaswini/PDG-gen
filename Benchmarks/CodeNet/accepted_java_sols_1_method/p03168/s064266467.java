import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[][] dp=new double[n+1][n+2];
		dp[0][0]=1;
		for(int i=0; i<n; i++){
			double p=sc.nextDouble();
			for(int j=0; j<=n; j++){
				dp[i+1][j+1]+=dp[i][j]*p;
				dp[i+1][j]+=dp[i][j]*(1-p);
			}
		}
		double ans=0;
		for(int i=n; i>=(n+2)/2; i--){
			ans+=dp[n][i];
		}
		System.out.println(ans);
	}
}
