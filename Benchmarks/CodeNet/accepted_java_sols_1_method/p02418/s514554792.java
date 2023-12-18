import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 public static void main(String[] args) { 

        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            String s = kb.readLine();
            String p = kb.readLine();

            int slen = s.length();
            int plen = p.length();
            int j = 0;
            for( int i = 0; i<slen; i++ ) {
                if( p.charAt( 0 ) == s.charAt( i ) ) {
                    int ij = i;
                    for( j = 0; j<plen; j++ ) {
                        ij = ( i+j ) % slen;
                        if( p.charAt( j ) != s.charAt( ij ) ) {
                            break;
                        }
                    }
                }
                if( plen == j ) { break; }
            }

            if( plen == j ) {
                System.out.println( "Yes" );            
            } else {
                System.out.println( "No" );
            }
        } catch( IOException e ) {
            System.err.println( e );
        }
	 }
}
	

