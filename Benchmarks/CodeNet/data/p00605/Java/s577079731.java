import java.util.Scanner;
public class Main {
	Scanner sc;
	void run(){
		sc = new Scanner( System.in );
		while( true ){
			boolean possible = true;
			int n = sc.nextInt();
			int k = sc.nextInt();
			if( n == 0 && k == 0 ){ return; }
			int[] s = new int[ k ];
			int[] rs = new int[ k ];
			for( int i = 0; i < k; i++ ){
				s[ i ] = sc.nextInt();
				rs[ i ] = 0;
			}
			for( int i = 0; i < n; i++ ){
				for( int j = 0; j < k; j++ ){
					rs[ j ] += ( sc.nextInt() );
					if( rs[ j ] > s[ j ] ){ possible = false; }
				}
			}
			System.out.println( possible ? "YES" : "NO" );
			
		}
	}
	public static void main( String[] args ){
		new Main().run();
	}
}