import java.util.*;
import java.io.*;

class Main {
	static boolean[] isExist = new boolean[2001];
	static int n;
	static int[] A;
    public static void main( String[] args ) {
        try {
	      	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
			n = Integer.parseInt( kb.readLine() );
			String[] buf = kb.readLine( ).split( " " );
			A = new int[n];
			int num;
			int sum = 0;
			for( int i=0; i<n; i++ ) {
				num = Integer.parseInt( buf[i] );
				for( int j=2000-num; 0<j; j-- ) {
					if( isExist[j] ) {
						isExist[ j+num ] = true;
					}
				}
				isExist[ num ] = true;
				A[i] = num;
			}
			
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
}