import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner S = new Scanner( System.in ) ;
		int n = S.nextInt() ;
		int k = S.nextInt() ;
		int[] arr = new int[n] ;
		for( int i=0;i<arr.length;i++ ) arr[i] = S.nextInt() ;
		Arrays.sort(arr) ;
		int result = 0 ;
		for( int i=0;i<k;i++ ) result += arr[i] ;
		System.out.println( result ) ;
	}
}