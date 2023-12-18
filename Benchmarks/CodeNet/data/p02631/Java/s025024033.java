import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner S = new Scanner( System.in ) ;
		int n = S.nextInt() ;
		int[] arr = new int[n] ;
		for( int i=0;i<n;i++ ) arr[i] = S.nextInt() ;
		for( int i=0;i<n;i++ ) {
			int result = 0;
			for( int j=0;j<n;j++ ) if( i==j ) continue ;
				else result ^= arr[j] ;

			System.out.print( result+" " ) ;
		}
	}
}