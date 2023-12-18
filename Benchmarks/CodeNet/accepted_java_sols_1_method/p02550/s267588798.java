import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().trim().split(" ") ;
		long N = Long.valueOf ( ss[0] ) ;
		long X = Long.valueOf ( ss[1] ) ;
		int M = Integer.valueOf ( ss[2] ) ;
		
		int[]  arr  = new int[M] ;
		arr[(int)X] = 1; 

		List<Integer> list2 = new ArrayList<>() ;
		list2.add ( (int)X ) ;

		int x1 = -1 ; 
		int x2 = -1 ;
		for ( int j=2 ; j<M*2+2 ; j++ ) {
			X = ( X * X ) % M ;
			if ( arr[(int)X] == 0 ) {
				arr[(int)X] = j  ;
				list2.add ( (int)X ) ;
			} else {
				x1 = arr[(int)X] ;
				x2 = j ;
				break ;
			}
		}
		
		if ( list2.size() >=  N ) {
			long t =0 ;
			for ( int j=0 ; j<N ; j++ )
				t += (long)list2.get(j).intValue() ;
			System.out.println( t ) ;
		} else if ( list2.get(list2.size()-1).intValue() == 0 ) {

			long t =0 ;
			for ( int j=0 ; j<N ; j++ ) {
				if ( list2.get(j).intValue() ==0 ) break ;
				t += (long)list2.get(j).intValue() ;
			}
			System.out.println( t ) ;
		} else {

			long t =0  ;
			for ( int j=0 ; j<x1-1 ; j++ )  {
				t += (long)list2.get(j).intValue() ;
			}
			long tx = 0 ;
			for ( int j=x1-1  ;j<x2-1 ; j++ ) 
				tx += (long)list2.get(j).intValue() ;

			N -= ( x1 -1 ) ;
			t += ( N / ( x2 - x1 ) ) * tx  ;

			long vmod =  N % ( x2 - x1 ) ;
			for ( int j=x1-1  ;j<x1-1+vmod ; j++ )  {
				t += (long)list2.get(j).intValue() ;
			}
			System.out.println( t ) ;



		}

	}
}
