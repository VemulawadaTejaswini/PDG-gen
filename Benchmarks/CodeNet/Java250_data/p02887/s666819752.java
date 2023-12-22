import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int  dp[]=new int[n];
		dp[0]=1;
		for(int i=1;i<n;i++) {
			
			if(s.charAt(i)!=s.charAt(i-1)) {
				dp[i]=dp[i-1] +1;
			}
			else dp[i]=dp[i-1];
		}
		
		System.out.println(dp[n-1]);
	}
}
