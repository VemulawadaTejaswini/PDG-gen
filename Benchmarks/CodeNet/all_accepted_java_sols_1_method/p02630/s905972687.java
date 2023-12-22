import java.util.* ;
import java.util.Map.Entry;
public class Main {
	
	public static void main(String[] args) {
		Scanner S = new Scanner( System.in ) ;
		int n = S.nextInt() ;
		Long[] arr = new Long[n] ;
		long result = 0 ;
			long aa = 0 ;
		HashMap<Long,Long> map = new HashMap<>() ;
		for( int i=0;i<n;i++ ){
			arr[i] = S.nextLong();
			result += arr[i] ;
			map.put( arr[i] , map.getOrDefault( arr[i] , aa )+1 ) ;
		} 

		int op = S.nextInt() ;
		for( int i=0;i<op;i++ ) {
			long a = S.nextLong() ;
			long b = S.nextLong() ;
			if( map.containsKey(a) ) {
			long value = map.get( a ) ;
			map.remove( a ) ;
			map.put( b , map.getOrDefault( b , aa )+value ) ;
			result = ( result - ( value*a ) ) + ( value*b ) ;
			}	
			System.out.println(  result );
		}
	}
}
