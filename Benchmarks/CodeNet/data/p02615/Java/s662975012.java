import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf( sc.nextLine().trim() ) ;

		String[] s00 = sc.nextLine().trim().split(" ") ; 
		List<Integer> list = new ArrayList<>() ; 
		for ( String ss : s00 ) 
			list.add ( Integer.valueOf ( ss ) ) ;
		Collections.sort ( list ) ;
		Collections.reverse( list ) ;
		
		long t = 0 ;
		t += (long)list.get(0).intValue() ;	
		if ( N == 2 ) {
		} else {
			
			List<int[]> list00 = new ArrayList<>() ;
			list00.add ( new int[] { list.get(1).intValue()  , list.get(0).intValue() } ) ;

			for ( int j=2; j<list.size() ; j++ ) {
				int cc = list.get(j).intValue()  ;
				int[] arr1 = list00.remove( list00.size() -1 ) ;
				t += arr1[0] ;
				list00.add ( new int[] { cc , arr1[0] } ) ;
				list00.add ( new int[] { cc , arr1[1] } ) ;
				Collections.sort ( list00 , (a1,a2)->Integer.compare( a1[0] ,a1[1] ) ) ;
			}
		}
		System.out.println ( t ) ;	

	}
}