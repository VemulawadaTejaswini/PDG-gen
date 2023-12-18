import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] dp=new int[n];
		dp[0]=0;
		
		for(int i=1;i<n;i++) {
			
			int sum=0;
			for(int j=i-1;j>=0;j--) {
				sum+=(arr[i] * arr[j]);
			}
			
			dp[i]=dp[i-1]+sum;
		}
		
		System.out.println(dp[n-1]);
	}
}
