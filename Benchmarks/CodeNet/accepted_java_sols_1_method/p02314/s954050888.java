

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] v=new int[m+1];
		for(int i=1;i<=m;i++) v[i]=scanner.nextInt();
		int[] dp=new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		dp[0]=0;
		for(int i=0;i<=n;i++){
			if(dp[i]!=Integer.MAX_VALUE/2){
				for(int j=1;j<=m;j++){
					if(i+v[j]<=n)
						dp[i+v[j]]=Math.min(dp[i+v[j]], dp[i]+1);
				}
			}
		}
		System.out.println(dp[n]);
	}

}

