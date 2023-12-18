import java.util.*;
import java.io.*;

class Main {
	static boolean[] isExist = new boolean[2001];
	static int[] A;
	static int n;
    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			n = Integer.parseInt( kb.readLine() );
			String[] buf = kb.readLine( ).split( " " );
			A = new int[n];
			int sum = 0;
			for( int i=0; i<n; i++ ) {
				A[i] = Integer.parseInt( buf[i] );
				sum += A[i];
			}
			solve( 0, sum );
			
			StringBuilder output = new  StringBuilder( );
			int q = Integer.parseInt( kb.readLine() );
			buf = kb.readLine( ).split( " " );
			for( int i=0; i<q; i++ ) {
				if( isExist[ Integer.parseInt( buf[i] ) ] ) {
					output.append( "yes" ).append( "\n" );			
				} else {
					output.append( "no" ).append( "\n" );
				}
			}
			System.out.print( output );            
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
	public static void solve( int p, int t )
	{
		isExist[t] = true;
		if( p < n ) {
			solve( p+1, t-A[p] );
			solve( p+1, t );
		}
		return;
	}
}