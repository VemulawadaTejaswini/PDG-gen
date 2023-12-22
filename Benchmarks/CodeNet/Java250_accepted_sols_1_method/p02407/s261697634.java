import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int n = 0;
		n = sc.nextInt ();

		int[] a = new int[ n ];
		
		for ( int i = 0; i < n; i++ ) {
			a[ i ] = sc.nextInt ();
		}

		for ( int j = n - 1; 0 <= j; j-- ) {
			System.out.print ( a[ j ] );
			if ( j == 0 ) {
				break;
			}
			System.out.print ( " " );
		}
		System.out.println ();
	}
}