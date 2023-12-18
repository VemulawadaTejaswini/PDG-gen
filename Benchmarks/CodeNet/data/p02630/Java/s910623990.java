import java.util.* ;
public class Main {
	
	public static void main(String[] args) {
		Scanner S = new Scanner( System.in ) ;
		int n = S.nextInt() ;
		int[] arr = new int[n] ;
		int result = 0 ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		for( int i=0;i<n;i++ ){
			arr[i] = S.nextInt();
			result += arr[i] ;
			map.put( arr[i] , map.getOrDefault( arr[i] , 0 )+1 ) ;
		} 

		int op = S.nextInt() ;
		for( int i=0;i<op;i++ ) {
			int a = S.nextInt() ;
			int b = S.nextInt() ;
			if( map.containsKey(a) ) {
			int value = map.get( a ) ;
			map.remove( a ) ;
			map.put( b , map.getOrDefault( b ,0 )+value ) ;
			result = ( result - ( value*a ) ) + ( value*b ) ;
			}	
			System.out.println(  result );
		}
	}
}
