import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().trim().split(" ") ;
		int N = Integer.valueOf ( ss[0] ) ;
		int K = Integer.valueOf ( ss[1] ) ;
		
		Map<Integer,Integer> map1 = new HashMap<>() ;

		for ( int x=0  ;x<N ; x++ ) {
			int a = Integer.valueOf ( sc.nextLine().trim() ) ;
			Map<Integer,Integer> map2 = new HashMap<>() ;
			for ( int y : map1.keySet() ) {
				
				int d = map2.getOrDefault(  y , 0 ) ;
				map2.put( y , Math.max ( d , map1.get(y).intValue() ) ) ;

				if ( Math.abs ( y - a ) > K ) continue ;

				d = map2.getOrDefault(  a , 0 ) ;
				map2.put( a , Math.max ( d , map1.get(y).intValue() + 1) ) ;


			}
			int d = map2.getOrDefault(  a , 0 ) ;
			map2.put( a , Math.max ( d , 1 ) ) ;
			map1 = map2 ;

		}
		int t = 0 ;
		for ( int x : map1.keySet() )
			t = Math.max ( t , map1.get(x).intValue() ) ; 
		System.out.println( t ) ;
	}
}