import java.util.*;
import java.lang.Math;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][3];
		int[][] abc=new int[n][3];
		for(int i=0;i<n;i++)for(int j=0;j<3;j++)abc[i][j]=sc.nextInt();
		for(int j=0;j<3;j++)dp[0][j]=abc[0][j];
		for(int i=1;i<n;i++){
			for(int j=0;j<3;j++){
				int _max=0;
				for(int k=0;k<3;k++){
					if(j!=k)if(_max<(dp[i-1][k]+abc[i][j]))_max=(dp[i-1][k]+abc[i][j]);
				}
				dp[i][j]=_max;
			}
		}
		int max=0;
		for(int j=0;j<3;j++)if(dp[dp.length-1][j]>max)max=dp[dp.length-1][j];
		System.out.print(max);
	}
}