import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long[][] a;
		long[][] b;
		long[][] c;
		int n = 0;
		int m = 0;
		int l = 0;

		Scanner sc= new Scanner( System.in );
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();

		a = new long[n][m];
		b = new long[m][l];
		c = new long[n][l];


		for ( int i = 0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < m ; j++ ) {
				a[i][j] = sc.nextLong();
			}
		}

		for ( int j = 0 ; j < m ; j++ ) {
			for ( int k = 0 ; k < l ; k++ ) {
				b[j][k] = sc.nextLong();
			}
		}

		for ( int i = 0 ; i < n ; i++ ) {
			for ( int k = 0 ; k < l ; k++ ) {
				for ( int j = 0 ; j < m ; j++ ) {
					if ( j == 0 ) {
						c[i][k] = 0;
					}
					c[i][k] += a[i][j] * b[j][k];
				}
				System.out.print( c[i][k] );
				if ( k != (l-1) ) {
					System.out.print( " " );
				}
			}
			System.out.print( "\n" );
		}
		sc.close();
	}
}
