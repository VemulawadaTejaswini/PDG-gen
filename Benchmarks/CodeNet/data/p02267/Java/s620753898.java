import java.io.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
        	int n = Integer.parseInt( kb.readLine( ) );
			String[] str = kb.readLine( ).split( " " );
			int[] S = new int[n];
			for( int i=0; i<n; i++ ) {
				S[i] = Integer.parseInt( str[i] );
			}
        	int q = Integer.parseInt( kb.readLine( ) );
			str = kb.readLine( ).split( " " );
			int[] T = new int[q];
			for( int i=0; i<q; i++ ) {
				T[i] = Integer.parseInt( str[i] );
			}
			int cnt = 0;
			for( int i: T ) {
				for( int j: S ) {
					if( i == j ) cnt++;
				}
			}
			System.out.println( cnt );
 
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}