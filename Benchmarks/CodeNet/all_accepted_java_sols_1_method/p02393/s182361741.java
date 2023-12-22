import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );
		int a[] = new int[ 3 ];
		int tmp = 0;

		for ( int i = 0; i < 3; i++ ) {
			a[ i ] = sc.nextInt ();
		}
		
		for ( int j = 1; 0 <= j; j-- ) {
			if ( a[ j + 1 ] < a[ j ] ) {
				tmp = a[ j + 1 ];
				a[ j + 1 ] = a[ j ];
				a[ j ] = tmp;
			}
		}
		
		if ( a[ 2 ] < a[ 1 ] ) {
			tmp = a[ 2 ];
			a[ 2 ] = a[ 1 ];
			a[ 1 ] = tmp;
		}

		System.out.println ( a[ 0 ] + " " + a[ 1 ] + " " + a[ 2 ] );
	}
}