import java.util.*;
import java.io.*;

class Main {
	static Integer n;
	static int cnt;
	public static final int SENTINEL = 1000000001;
    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			n = Integer.parseInt( kb.readLine() );
			
			ArrayList<Integer> S = new ArrayList<Integer>(n);
			String[] buf = kb.readLine( ).split( " " );
			Integer num;
			for( int i=0; i<n; i++ ) {
				num = Integer.parseInt( buf[i] );
				S.add( num );
			}
			cnt = 0;
			mergeSort( S, 0, n );
			
			StringBuilder output = new  StringBuilder( );
			for( int i=0; i<S.size(); i++ ) {
				output.append( S.get(i) ).append( " " );
			}
			output.deleteCharAt( output.lastIndexOf( " " ) ).append( "\n" );
			output.append( cnt );
			System.out.println( output );            
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
	public static void merge( ArrayList<Integer> S, int left, int mid, int right )
    {
		int n1 = mid - left;
		int n2 = right - mid;
	
		ArrayList<Integer> L = new ArrayList<Integer>(n1);
		ArrayList<Integer> R = new ArrayList<Integer>(n2);
		for( int i=0; i<n1; i++ ) {
		    L.add( S.get( left+i ) );
		}
		for( int i=0; i<n2; i++ ) {
		    R.add( S.get( mid+i ) );
		}
		
		L.add( SENTINEL );
		R.add( SENTINEL );	
		int i, j;
		i = j = 0;
		for( int k=left; k<right; k++ ) {
		    cnt++;
		    if( L.get(i) <= R.get(j) ) {
				S.set( k, L.get( i++ ) );
		    } else {
		        S.set( k, R.get( j++ ) );
		    }
		}	
		return;
    }
	public static void mergeSort( ArrayList<Integer> S, int left, int right )
    {
		if( left+1 < right ) {
			int mid = ( left+right )/2;
			mergeSort( S, left, mid );
			mergeSort( S, mid, right );
			merge( S, left, mid, right );
		}		
		return;
    }
}