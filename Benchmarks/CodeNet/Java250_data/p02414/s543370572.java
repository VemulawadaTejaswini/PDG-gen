import java.io.*;
 
class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
 
            String[] str = kb.readLine().split( " " );
            int n = Integer.parseInt( str[0] );
            int m = Integer.parseInt( str[1] );
            int l = Integer.parseInt( str[2] );
                         
            int[][] matrixA = new int[n][m];
            int[][] matrixB = new int[m][l];
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                for( int j=0; j<m; j++ ) {
                    matrixA[i][j] = Integer.parseInt( str[j] );
                }
            }
            for( int i=0; i<m; i++ ) {
                str = kb.readLine().split( " " );
                for( int j=0; j<l; j++ ) {
                    matrixB[i][j] = Integer.parseInt( str[j] );
                }
            }
            StringBuilder output = new	StringBuilder( 400+1 );	
 			long c;
            for( int i=0; i<n; i++ ) {
                for( int j=0; j<l; j++ ) {
                	c = 0;
	                for( int k=0; k<m; k++ ) {
                        c += ( matrixA[i][k] * matrixB[k][j] );
                    }
                    output.append( c );
                    output.append( " " );
                }
                output.deleteCharAt( output.lastIndexOf( " " ) );
                output.append( "\n" );
            }
             
            System.out.print( output );
             
        } catch( IOException e ) {
            System.err.println( e );
        }
    }
}