import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] dp=new int[m+1][1<<n];
		Arrays.fill(dp[0],100000001);
		dp[0][0]=0;
		for(int i=1; i<=m; i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int state=0;
			for(int j=0; j<b; j++){
				state+=1<<(sc.nextInt()-1);
			}
			for(int k=1; k<1<<n; k++){
				dp[i][k]=dp[i-1][k];
			}
			for(int t=0; t<1<<n; t++){
				dp[i][t|state]=Math.min(dp[i][t|state],dp[i-1][t]+a);
			}
		}
		if(dp[m][(1<<n)-1]==100000001){
			dp[m][(1<<n)-1]=-1;
		}
		System.out.println(dp[m][(1<<n)-1]);
	}
}
