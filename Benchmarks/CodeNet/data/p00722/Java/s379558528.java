import java.util.Scanner;
public class Main {
	static final int MAX  = 1000001;
	Scanner sc;
	boolean[] a;

	Main(){
		sc = new Scanner( System.in );
		a = new boolean[ MAX ];
		a[ 0 ] = false;
		a[ 1 ] = false;
		for( int i = 2; i < a.length; i++ ){
			a[ i ] = true;
		}
		for( int i = 2; i < MAX; i++ ){
			if( !a[ i ] ){ continue; }
			for( int j = i * 2; j < MAX; j += i ){
				a[ j ] = false;
			}
		}
	}
	void run(){
		while( true ){
			int a0 = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			int c = 0;
			int ans = 0;
			if( a0 == 0 && d == 0 && n == 0){ return; }
			for( int cur = a0; ; cur += d ){
				if( a[ cur ] ){
					if( ++c == n ){
						ans = cur;
						break;
					}
				}
			}
			System.out.println( ans );
		}
	}
	public static void main( String[] args ){
		new Main().run();
	}
}