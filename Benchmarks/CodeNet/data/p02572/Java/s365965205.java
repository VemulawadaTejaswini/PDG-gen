import java.util.*;
import java.lang.*;
class Main{
	static long findProSum(long a[], int n) {
		 long sum = 0 ;
		 long mod=(long)Math.pow(10, 9)+7; 
	        
	        long dp[]=new long[n];
	        for(int i=n-1;i>=0;i--)
	        {
	            dp[i] = sum;
	            sum=(sum%mod+a[i]%mod)%mod;
	        }
	        
	        sum = 0 ;
	        
	        for(int i=0;i<n;i++)
	        {
	            sum =(sum%mod+ a[i]%mod*dp[i]%mod)%mod;
	        }
	        return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) a[i]=sc.nextLong();
		long sum= findProSum(a,a.length);
		System.out.println(sum);

	}

}
