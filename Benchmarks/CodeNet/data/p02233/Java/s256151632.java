

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dp=new int[45];
		dp[0]=1;
		dp[1]=1;
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=2;i<=n;i++)
			dp[i]=dp[i-1]+dp[i-2];
		System.out.println(dp[n]);
	}

}

