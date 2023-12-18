import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {

			String str = kb.readLine();
			String[] tmpArray = str.split( " " );
			int n=Integer.parseInt( tmpArray[0] );
			int m=Integer.parseInt( tmpArray[1] );
			int l=Integer.parseInt( tmpArray[2] );
						
			int[][] matrixA = new int[n][m];
			int[][] matrixB = new int[m][l];
			double[][] matrixC = new double[n][l];
			for( int i=0; i<n; i++ ) {
				str = kb.readLine();
				tmpArray = str.split( " " );
				for( int j=0; j<m; j++ ) {
					matrixA[i][j]=Integer.parseInt( tmpArray[j] );
				}
			}
			for( int i=0; i<m; i++ ) {
				str = kb.readLine();
				tmpArray = str.split( " " );
				for( int j=0; j<l; j++ ) {
					matrixB[i][j]=Integer.parseInt( tmpArray[j] );
				}
			}

			for( int i=0; i<n; i++ ) {
				for( int k=0; k<m; k++ ) {
					for( int j=0; j<l; j++ ) {
						matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
					}
				}
			}
			
			for( int i=0; i<n; i++ ) {
				for( int j=0; j<l; j++ ) {
					if( l-1 != j ) {
						System.out.printf( "%.0f ", matrixC[i][j] );
					} else {
						System.out.printf( "%.0f\n", matrixC[i][j] );
					}
				}
			}
			
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}