import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
        	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        	int n = Integer.parseInt( kb.readLine( ) );
			String[] str = kb.readLine( ).split( " " );

			Set<Integer> S = new TreeSet<Integer>( );
			for( int i=0; i<n; i++ ) {
				S.add( Integer.parseInt( str[i] ) );
			}
	
        	int q = Integer.parseInt( kb.readLine( ) );
			str = kb.readLine( ).split( " " );
			int[] T = new int[ q ];
			for( int i=0; i<q; i++ ) {
				T[i] = Integer.parseInt( str[i] );
			}

			int cnt = 0;
			for( Integer val: T ) {
				if( S.contains( val ) ) cnt++;
			}
			System.out.println( cnt );

        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}