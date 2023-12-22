import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
        	BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        	int n = Integer.parseInt( kb.readLine( ) );
			String[] str = kb.readLine( ).split( " " );
			int[] S = new int[ n ];
			for( int i=0; i<n; i++ ) {
				S[i] = Integer.parseInt( str[i] );
			}

        	int q = Integer.parseInt( kb.readLine( ) );
			str = kb.readLine( ).split( " " );
			int[] T = new int[ q ];
			for( int i=0; i<q; i++ ) {
				T[i] = Integer.parseInt( str[i] );
			}

			int cnt = 0;
			int low, high, middle;
			for( int i=0; i<q; i++ ) {
				low = 0;
				high = n-1;
				middle = n/2;
				while( low <= high ) {
					if( T[i] == S[middle] ) {
						cnt++;
						break;
					} else if( T[i] < S[middle] ) {
						high = middle - 1;
						middle = ( low+high )/2;
					} else {
						low = middle + 1;
						middle = ( low+high )/2;
					}
				}				
			}
			System.out.println( cnt );

        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}