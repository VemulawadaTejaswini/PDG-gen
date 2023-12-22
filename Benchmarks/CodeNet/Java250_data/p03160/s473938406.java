
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		long[]a = input(n);
		long[] dp = new long[n];
		for(int i =1 ; i < n ;i++) {
			long temp = Math.abs(a[i]-a[i-1]) + dp[i-1];
			if(i>1)temp = Math.min(temp, Math.abs(a[i] - a[i-2] )+ dp[i-2]);
			dp[i]=temp  ;
		}
		System.out.println(dp[n-1]);
	}
	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}

}
