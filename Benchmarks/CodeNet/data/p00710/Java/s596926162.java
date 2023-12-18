import java.util.Scanner;

public class Main {
	Scanner sc;
	private void run(){
		sc = new Scanner( System.in );
		while( true ){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if( n == 0 && r == 0 ){ return; }
			int[] cards = new int[ n ];
			for( int i = 0; i < n; i++ ){
				cards[ i ] = n - i;
			}
			for( int i = 0; i < r; i++ ){
				int p = sc.nextInt();
				int c = sc.nextInt();
					int[] pcards = new int[ p + 1 ];
					for( int j = 0; j < p - 1; j++ ){
						pcards[ j ] = cards[ j ];
					}
					for( int j = 0; j < c; j++ ){
						cards[ j ] = cards[ p - 1 + j ];
					}
					for( int j = 0; j < p - 1; j++ ){
						cards[ c + j ] = pcards[ j ];
					}
			}
			System.out.println( cards[ 0 ] );
		}
	}
	public static void main( String[] args ){
		new Main().run();
	}
}