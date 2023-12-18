import java.util.Scanner;

public class Main {
	Scanner sc;
	final static int UNDEF = 999999999;
	void run(){
		sc = new Scanner( System.in );
		while( true ){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( n == 0 && m == 0 ){ return; }
			int[] taro = new int[ n ];
			int tsum = 0;
			int[] hana = new int[ m ];
			int hsum = 0;
			for( int i = 0; i < n; i++ ){
				taro[ i ] = sc.nextInt();
				tsum += taro[ i ];
			}
			for( int i = 0; i < m; i++ ){
				hana[ i ] = sc.nextInt();
				hsum += hana[ i ];
			}
			int tt = UNDEF;
			int ht = UNDEF;
			for( int i = 0; i < n; i++ ){
				int ctsum = tsum - taro[ i ];
				for( int j = 0; j < m; j++ ){
					int chsum = hsum - hana[ j ];
					if( ctsum + hana[ j ] == chsum + taro[ i ] ){
						if( ctsum + hana[ j ] < tt + ht ){
							tt = taro[ i ];
							ht = hana[ j ];
						}
					}
				}
			}
			if( tt != UNDEF ){
				System.out.println( tt + " " + ht);
			}else{
				System.out.println( -1 );
			}
		}
	}
	public static void main( String[] args ){
		new Main().run();
	}
}