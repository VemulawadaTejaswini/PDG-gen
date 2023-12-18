import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] a;
		int[][] b;
		int[][] c;
		int n = 0;
		int m = 0;
		int l = 0;

		Scanner sc= new Scanner( System.in );
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();

		a = new int[n][m];
		b = new int[m][l];
		c = new int[n][l];


		for ( int i = 0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < m ; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}

		for ( int j = 0 ; j < m ; j++ ) {
			for ( int k = 0 ; k < l ; k++ ) {
				b[j][k] = sc.nextInt();
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
				System.out.print( BigDecimal.valueOf(c[i][k]).toPlainString() );
				if ( k != (l-1) ) {
					System.out.print( " " );
				}
			}
			System.out.print( "\n" );
		}
		sc.close();
	}
}
