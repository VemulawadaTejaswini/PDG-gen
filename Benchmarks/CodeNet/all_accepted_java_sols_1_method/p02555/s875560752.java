import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf ( sc.nextLine().trim() ) ;

		int mod = 1000000007 ;

		long arr[] = new long[n+1] ; 
		for ( int j=3 ;j<=n ; j++ )
			arr[j] = 1 ;

		for ( int j=3 ;j<=n ; j++ ) {
			for ( int r=3; r<=n ; r++ ) {
				if ( j + r > n ) break ;
				arr[j+r] += arr[j] ;
				arr[j+r] %= mod ;
			}
		}
		System.out.println( arr[n] ) ;

	}
}