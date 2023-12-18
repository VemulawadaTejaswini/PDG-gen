import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner S = new Scanner( System.in ) ;
		int n = S.nextInt() ;
		int[] arr = new int[n] ;
		int result = 0 ;
		for( int i=0;i<n;i++ ) {
			arr[i] = S.nextInt() ;
			result ^= arr[i] ;
		}
		for( int i=0;i<n;i++ ) {
			System.out.print( ( result^arr[i] )+" " ) ;
		}
	}
}