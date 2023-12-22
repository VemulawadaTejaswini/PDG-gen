import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf ( sc.nextLine().trim() ) ;

		List<Boolean> list0 = Arrays.asList( false , false ) ;
		
		int mod = 1000000007 ;
		Map<List<Boolean>,Long> map = new HashMap<>() ; 
		map.put( list0 , 1L ) ;
		for ( int j=0 ; j<n ; j++ ) {
			Map<List<Boolean>,Long> map2 = new HashMap<>() ; 
			for ( List<Boolean> list  : map.keySet() ) {

				List<Boolean> list1 = Arrays.asList ( true , list.get(1).booleanValue() ) ;
				long d = map2.getOrDefault( list1 , 0L )  + map.get( list ).longValue() ;
				map2.put( list1 , d % mod ) ;

				list1 = Arrays.asList ( list.get(0).booleanValue() , true ) ;
				d = map2.getOrDefault( list1 , 0L )  + map.get( list ).longValue() ;
				map2.put( list1 , d % mod ) ;

				list1 = list ;
				d = map2.getOrDefault( list1 , 0L )  + map.get( list ).longValue() * 8 ;
				map2.put( list1 , d % mod ) ;

			}
			map = map2 ;
		}
		List<Boolean> list2 = Arrays.asList( true , true ) ;
		long d = map.getOrDefault( list2 , 0L ) ;
		System.out.println( d ) ;
	}
}