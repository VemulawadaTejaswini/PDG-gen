import java.util.*;
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fab(n));
	}
	//recursive 
	public static int  fib(int n){
		if(n==1) return 1; 
		if(n==0) return 1; 
		return fib(n-1)+fib(n-2);
	}
	public static int fab(int n){
		int dp[] = new int[n+1];
		dp[0]=1;
		dp[1] =1;
		for(int i=2;i<=n;i++){
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
}