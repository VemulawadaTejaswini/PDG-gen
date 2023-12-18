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
		
		long[][] dp = new long[n+1][m+1];
		int c=0;
		
		for( int in =0 ; in < n ; in++ ) {
			dp[in+1][0] = dp[in][0] + a[in];
			if(dp[in+1][0] <= k ) {
				c = Math.max(c, in+1);
			}else {
				break;
			}
		}

		for( int im =0 ; im < m ; im++ ) {
			dp[0][im+1] = dp[0][im] + b[im];
			if(dp[0][im+1] <= k ) {
				c = Math.max(c, im+1);
			}else {
				break;
			}
		}
		long max = 0;
		for( int in =1 ; in < n+1 ; in++ ) {
			for( int im =1 ; im < m+1 ; im++ ) {
				dp[in][im] = Math.min( dp[in][im-1] + b[im-1] , dp[in-1][im] + a[in-1]) ;
				if( dp[in][im] <= k ) {
					c = Math.max(c, in+im);
				}else {
					break;
				}
			}
		}

		System.out.println(c);
//		for( int in =0 ; in < n+1 ; in++ )
//			System.err.println(Arrays.toString(dp[in]));
		
	}

}