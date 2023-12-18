
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
	    Deque<Integer> aq = new ArrayDeque<>();
	    Deque<Integer> bq = new ArrayDeque<>();
		
		int[] a = new int[n+1];
		for( int i=0 ; i<n ; i++ ) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[m+1];
		for( int i=0 ; i<m ; i++ ) {
			b[i] = sc.nextInt();
		}
		
		long[][] dp = new long[n+1][n+m+1];
		int c=0;
		
		long max = 0;
		for( int in =0 ; in < n ; in++ ) {
			for( int im =0 ; im < m ; im++ ) {
				dp[in+1][im] = dp[in][im] + a[in];
				dp[in][im+1] = dp[in][im] + b[im];
				
				long ma = Math.min(dp[in+1][im], dp[in][im+1]);
				if( ma <= k ) {
					c = Math.max(c,in+im+1);
				}
			}
		}

		System.out.println(c);
//		for( int in =0 ; in < n+1 ; in++ )
//			System.err.println(Arrays.toString(dp[in]));
		
	}

}