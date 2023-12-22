import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int r = 0;
		int c = 0;
		int[][] sp_sheet;

		Scanner sc= new Scanner( System.in );


		r = sc.nextInt();
		c = sc.nextInt();

		sp_sheet = new int[r+1][c+1];

		for( int i = 0 ; i < r ; i++ ) {
			for ( int j = 0 ; j < c ; j++ ) {

				sp_sheet[i][j] = sc.nextInt();

				if ( j == 0 ) {
					sp_sheet[i][c] = 0;
				}
				sp_sheet[i][c] += sp_sheet[i][j];

				if ( i == 0 ) {
					sp_sheet[r][j] = 0;
				}
				sp_sheet[r][j] += sp_sheet[i][j];
			}
			if ( i == 0 ) {
				sp_sheet[r][c] = 0;
			}
			sp_sheet[r][c] += sp_sheet[i][c];
		}

		for( int i = 0 ; i < ( r + 1 ) ; i++ ) {
			for ( int j = 0 ; j < ( c + 1 ) ; j++ ) {
				System.out.print( sp_sheet[i][j] );
				if ( j != c ) {
					System.out.print( " " );
				}
			}
			System.out.print( "\n" );
		}
		sc.close();
	}
}
