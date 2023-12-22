import java.util.Scanner;

class Main {
	public static void main( String[] args ) {
		Scanner stdIn = new Scanner( System.in );

		int[] data = new int[ 10 ];

		for ( int i = 10; i-- > 0; data[ i ] = stdIn.nextInt() ) ;

		for ( int i = 0; i < 3; i++ ) {
			int max = i;
			for ( int j = 9; j > i; j-- )
				if ( data[ max ] < data[ j ] )
					max = j;

			int tmp = data[ i ];
			System.out.println( data[ i ] = data[ max ] );
			data[ max ] = tmp;
		}
	}
}