import java.util.Scanner;

public class Main {
	Scanner sc;
	final static int MAX = 300001;
	int counter;
	int[] msprime;
	Main(){
		counter = 0;
		msprime = new int[ MAX ];
		for( int i = 6; i <= MAX; i += ( i % 7 == 1 ? 5 : 2) ){
			boolean isMSPrime = true;
			for( int j = 6; j * j <= i; j += ( j % 7 == 1 ? 5 : 2) ){
				if( i % j == 0 ){
					isMSPrime = false;
					break;
				}
			}
			if( isMSPrime ){ msprime[ counter++ ] = i; }
		}
	}
	void run(){
		sc = new Scanner( System.in );
		while( true ){
			int n = sc.nextInt();
			if( n == 1 ){ return; }
			System.out.print( n + ":" );
			for( int i = 0; i < counter; i++ ){
				if( n % msprime[ i ] == 0 ){
					System.out.print( " " + msprime[ i ] );
				}
			}
			System.out.println();
		}
	}
	
	public static void main( String[] args ){
		new Main().run();
	}
}