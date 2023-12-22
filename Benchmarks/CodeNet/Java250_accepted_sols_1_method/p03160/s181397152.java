

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []arr=new int[n];
		int []dp= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		dp[0]=0;
		for(int i=1;i<n;i++) {
			if(i-2>=0) {
				dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));
			}
			else
				dp[i]=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
		}
		System.out.println(dp[n-1]);
	}

}
