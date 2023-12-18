import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {

		InputStreamReader s = new InputStreamReader(System.in) ; 

		int tt = 0 ;
		while ( true ) {
			int v = s.read();
			if ( v >= 48 && v <=57 ) {
				tt = tt * 10 + ( v - 48 ) ;
			}  else {
				break ;
			}
		}
		int N = tt ;

		tt = 0 ;
		int idx0=0  ;
		int[] arr = new int[N] ; 
		while ( true ) {
			int v = s.read();
			if ( v >= 48 && v <=57 ) {
				tt = tt * 10 + ( v - 48 ) ;
			} else if ( v == 32 ) {
				if ( tt ==0 ) continue  ;
				arr[idx0++] = tt ; 
				tt = 0 ;
			}  else {
				arr[idx0++] = tt ; 
				break ;
			}

		}
		Arrays.sort  ( arr ) ;
		int mm = arr[arr.length-1] ;

		BitSet bs_prime = createPrimes( mm + 1 ) ; 
		int[] primes = new int[bs_prime.cardinality()] ; 
		for ( int idx=0,p=bs_prime.nextSetBit(0) ; p>=0 ; p=bs_prime.nextSetBit(p+1) )
			primes[idx++] = p ; 

		int judge = -1 ;
		for ( int prime : primes ) {
			int xx = 0 ;
			for ( int j=0 ; j<arr.length ; j++ ) {
				if  ( arr[j] % prime == 0 )
					xx ++ ; 
			}
			if ( xx >= 2 ) {
				judge = 1 ; 
				break ;
			}
		}

		if ( judge == 1 ) {
			long gcd = arr[0] ;
			for ( int j=0 ; j<arr.length ; j++ ) {
				gcd = getGcd ( gcd , arr[j] ) ;
				if ( gcd == 1 ) {
					judge = 2 ; 
					break ;
				}
			}
		}
		if ( judge == -1 ) {
			System.out.println( "pairwise coprime" ) ;
		} else if ( judge == 2 ) {
			System.out.println( "setwise coprime" ) ;
		} else {
			System.out.println( "not coprime" ) ;
		}
	}

	public static void func ( int v0 , Set<Integer> set00 , int k0 , int[] primes  , long mm , Map<Integer,Set<Integer>> map ) {
		map.put( v0 , set00 ) ; 
		for ( int j=k0  ;j<primes.length ; j++ ) {
			int prime = primes[j] ; 
			if ( (long)v0 * prime > mm ) break ; 
			Set<Integer> set01 = new HashSet<>(set00) ;
			set01.add ( prime ) ; 
			func ( v0 * prime , set01 , j , primes , mm  , map ) ;
		}
	}

	public static BitSet createPrimes( int n ){
		BitSet bs = new BitSet();
		bs.set( 2, n ) ;
		for ( int i=bs.nextSetBit(0) ; i>=0 ; i=bs.nextSetBit(i+1) ){
			if ( (long) i * i > bs.length() ) break;
			for ( int k=2 ; (long)k*i < bs.length() ; k++ )
				bs.clear(k*i);
		}
		return bs ;
	}
	public static long getGcd( long a , long b ) {

		while ( a>0 ) {
			long mod = b%a ;
			b = a;
			a = mod ;
		}
		return b ;
	}

}