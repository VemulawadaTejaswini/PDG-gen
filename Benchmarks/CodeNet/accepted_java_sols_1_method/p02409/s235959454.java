import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			String str = kb.readLine();
			int n = Integer.parseInt( str );
			
			int[][][] oHouse= new int[5][4][11];
			int[] tnum= new int[5];
			String[] tmpArray;
			for( int i=0; i<n; i++ ) {
				str = kb.readLine();
				tmpArray = str.split( " " );
				for( int j=0; j<4; j++ ) {
					tnum[j]=Integer.parseInt( tmpArray[j] );
				}
				oHouse[ tnum[0]-1 ][ tnum[1]-1 ][ tnum[2]-1 ] += tnum[3];
			}
			for( int i=0; i<4; i++ ) {
				for( int j=0; j<3; j++ ) {
					for( int k=0; k<10; k++ ) {
						System.out.print( " " + oHouse[i][j][k] );	
					}
					System.out.print( "\n" );	
				}
				if( 3 != i ) {
					System.out.println( "####################" );	
				}
			}
		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}