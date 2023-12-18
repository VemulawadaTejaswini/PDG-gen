import java.util.Scanner;
public class Main {
	
	private Scanner sc;
	private void run() {
		sc = new Scanner( System.in );
		
		while( true ) {
			int n = sc.nextInt();
			if( n == 0 ) { return; }
			
			int[] a = new int[ n ];
			int[] maxsum = new int[ n ];
			int maxi = Integer.MIN_VALUE;
			
			for( int i = 0; i < n; i++ ) {
				a[ i ] = sc.nextInt();
				if( i == 0 ) {
					maxsum[ i ] = a[ i ];
				} else {
					maxsum[ i ] = Math.max(  a[ i ], a[ i ] + maxsum[ i - 1 ] );
				}
				maxi = Math.max( maxi, maxsum[ i ] );
			}
			
			System.out.println( maxi );
		}
	}
	public static void main( String[] args ) {
		new Main().run();
	}
}