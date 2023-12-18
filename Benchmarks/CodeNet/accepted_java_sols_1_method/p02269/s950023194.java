import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
        	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        	
        	int n = Integer.parseInt( kb.readLine( ) );
        	Set<String> dict = new HashSet<String>();
			String[] str = new String[3];
			for( int i=0; i<n; i++ ) {
				str = kb.readLine( ).split( " " );
				if( "insert".equals( str[0] ) ) {
					dict.add( str[1] );
				} else if( "find".equals( str[0] ) ) {
					if( dict.contains( str[1] ) ) {
						System.out.println( "yes" );
					} else {
						System.out.println( "no" );
					}
				}
			}
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}