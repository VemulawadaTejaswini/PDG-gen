import java.util.Scanner;

public class Main {
	private static final int N_MAX = 2 << 15;
	private boolean[] era;
	private void run() {
		era = new boolean [ N_MAX + 1 ];
		era[ 1 ] = true;
		for( int i = 2; i <= N_MAX; i++ ) {
			if( era[ i ] ) { continue; }
			for( int j = i * 2; j <= N_MAX; j = j + i ) {
				era[ j ] = true;
			}
		}
		
		Scanner sc = new Scanner( System.in );
		while( sc.hasNext() ) {
			int counter = 0;
			int n = sc.nextInt();
			if( n == 0 ) { break; }
			for( int p1 = 2; p1 <= n / 2; p1++ ) {
				if( era[ p1 ] ) { continue; }
				if( !era[ n - p1 ] ) {
					counter++;
				}
			}
			System.out.println( counter );
		}
		
	}
	public static void main( String[] args ) {
		new Main().run();
	}
}