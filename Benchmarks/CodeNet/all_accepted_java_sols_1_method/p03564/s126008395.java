import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int[] dp = new int[15];
		dp[1]=2; //Minimum value after one operation even if K=1
		for (int i = 2; i <= N; i++)
			dp[i]=Math.min(dp[i-1]*2, dp[i-1]+K);
		System.out.println(dp[N]);
	}
}