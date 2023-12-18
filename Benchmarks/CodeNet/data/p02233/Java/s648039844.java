import java.util.Scanner;

public class Main {
	static int[] dp = new int[50];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			dp[i] = -1;
		}
		System.out.println(fib(n));
	}
	
	public static int fib(int n){
		if(n==0) 
			return dp[n]=1;
		else if(n==1) 
			return dp[n]=1;
		else
			return dp[n]=fib(n-1)+fib(n-2);
	}
}