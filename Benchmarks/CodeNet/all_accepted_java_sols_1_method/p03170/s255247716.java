//package compilers;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=in.nextInt();
		int dp[]  = new int[sum+1];
		int arr[]= new int[n];
		dp[0] = 1; // dp[i] is optimal anwser for that i
		Arrays.fill(dp,1);
		for(int i=0;i<n;i++)
			arr[i] = in.nextInt();
		
		for(int i = 1;i<=sum;i++) {
			for(int j=0;j<n;j++) {
				if(i- arr[j] >= 0 && dp[i-arr[j]]==1) {
					dp[i]=0;
					break;
				}
			}
		}
	   if(dp[sum]==0)
		   System.out.println("First");
	   else System.out.println("Second");
	}

}
