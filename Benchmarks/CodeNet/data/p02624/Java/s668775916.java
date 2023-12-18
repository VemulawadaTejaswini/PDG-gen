import java.util.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf( sc.nextLine().trim() ) ;

		BitSet bs_prime = createPrimes ( 10000000 ) ;
		List<Integer> primes = new ArrayList<>();
		for ( int p=bs_prime.nextSetBit(0) ; p>=0 ; p=bs_prime.nextSetBit(p+1 ) )
			primes.add ( p  ) ;

		long[] t = new long[1] ; 
		func( 1 , 1 , 1 , -1 , primes , N , t ) ;
		System.out.println( t[0] ) ;
		

	}

	public static void func ( long v0 , long v1 , long v2 , int k00 , List<Integer> primes , long n , long[] t ) {
		if ( v0 > n ) return ; 
		t[0] += v0 * v1 * v2 ;
		int k0 = k00 < 0 ? 0 : k00 ;
		for ( int k=k0  ;k<primes.size() ; k++ ) {
			int prime = primes.get(k).intValue() ; 
			if ( v0 * prime > n ) break ; 
			
			if ( k == k00 ) {
				func ( v0 * prime , v1 , v2 + 1 , k , primes , n , t ) ;		


			} else  {
				func ( v0 * prime , v1 *  v2 , 2  , k , primes , n , t ) ;		
			}
		}
	}

	public static BitSet createPrimes( int n ){
		BitSet bs = new BitSet();
		bs.set( 2, n ) ;
		for ( int i=bs.nextSetBit(0) ; i>=0 ; i=bs.nextSetBit(i+1) ) {
			if ( (long) i *i > n ) break ;
			for ( int k=2 ; (long)k*i < bs.length() ; k++ )
				bs.clear(k*i);
		}
		return bs ;
	}
}