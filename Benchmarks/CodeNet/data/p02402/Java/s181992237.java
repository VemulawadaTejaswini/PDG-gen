import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int n = 0;
		int min = 0;
		int max = 0;
		long sum = 0;

		// n??\???
		n = sc.nextInt ();

		int[] a = new int[ n ];

		// a??\???
		for (int i = 0; i < n; i++ ) {
			a[ i ] = sc.nextInt ();
		}

		// ????¨??????????
		for (int j = 0; j < n; j++ ) {
			sum += a[ j ];
		}

		// ?????§?????\???
		for (int  x = 0; x < n; x++ ) {
			if ( x == 0 ) {
				max = a[ x ];
			} else {
				if ( max < a[ x ] ) {
					max = a[ x ];
				}
			}
		}

		// ????°??????????
		for (int  y = 0; y < n; y++ ) {
			if ( y == 0 ) {
				min = a[ y ];
			} else {
				if ( a[ y ] < min ) {
					min = a[ y ];
				}
			}
		}



		System.out.print ( min + " " + max + " " + sum + "\n" );
	}
}