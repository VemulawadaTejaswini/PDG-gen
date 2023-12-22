import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[] arr=new int[n];
		int k=s.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int[] dp=new int[n];
		
		dp[0]=0;
		for(int i=1;i<n;i++) {
			int ans=1000000000;
			for(int j=Math.max(0,i-k);j<i;j++) {
				ans=Math.min(dp[j]+Math.abs(arr[i]-arr[j]),ans);
			}
			dp[i]=ans;
		}
		
		System.out.println(dp[n-1]);
		
	
		
	}
}