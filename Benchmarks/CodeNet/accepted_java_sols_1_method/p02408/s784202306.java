import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		
		Scanner  sc = new Scanner ( System.in );
		StringBuilder str = new StringBuilder ();
		
		boolean [][] cards = new boolean[ 4 ][ 13 ];
		
		int n = sc.nextInt ();
		
		for ( int i = 0; i < n; i++ ) {
			String art = sc.next ();
			int rank = sc.nextInt ();
			
			if ( art.equals ( "S" ) ) {
				cards[ 0 ][ rank - 1 ] = true;
			} else if ( art.equals ( "H" ) ) {
				cards[ 1 ][ rank - 1 ] = true;
			} else if ( art.equals ( "C" ) ) {
				cards[ 2 ][ rank - 1 ] = true;
			} else {
				cards[ 3 ][ rank - 1 ] = true;
			}
		}
		for ( int i = 0; i < 4; i++ ) {
			for ( int j = 0; j < 13; j++ ) {
				if ( !cards[ i ][ j ] ) {
					if ( i == 0 ) {
						System.out.println ( "S " + ( j + 1 ) );
					} else if ( i == 1 ) {
						System.out.println ( "H " + ( j + 1 ) );
					} else if ( i == 2 ) {
						System.out.println ( "C " + ( j + 1 ) );
					} else {
						System.out.println ( "D " + ( j + 1 ) );
					}
				}
			}
		}
	}
}