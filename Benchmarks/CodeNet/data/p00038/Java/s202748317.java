import java.util.Scanner;
import java.util.Arrays;

public class Main {

	Scanner sc;

	private Main(){
		sc = new Scanner( System.in );
	}

	private void run(){
		while( sc.hasNext() ){
			String str = sc.next();
			int[] cards = new int[ 5 ];
			String[] cardsStr = str.split( "," );
			for( int i = 0; i < cardsStr.length; i++ ){
				cards[ i ] = Integer.parseInt( cardsStr[ i ] );
			}
			int[] hist = new int[ 14 ];
			for( int i = 0; i < hist.length; i++ ){
				hist[ i ] = 0;
			}
			for( int card : cards ){
				hist[ card ] ++;
			}
			Arrays.sort( cards ); // Very Important!!!!!!

			/* four card */
			if( this.checkSameCard( hist, 4 ) ){
				System.out.println( "four card" );
				continue;
			}

			/* full house */
			if( this.checkFullHouse( cards ) ){
				System.out.println( "full house" );
				continue;
			}

			/* straight */
			if( this.checkStraight( cards ) ){
				System.out.println( "straight" );
				continue;
			}

			/* three card */
			if( this.checkSameCard( hist, 3 ) ){
				System.out.println( "three card" );
				continue;
			}

			/* two pair */
			if( this.checkTwoPair( hist ) ){
				System.out.println( "two pair" );
				continue;
			}

			/* one pair */
			if( this.checkSameCard( hist, 2 ) ){
				System.out.println( "one pair" );
				continue;
			}

			System.out.println( "null" );
		}
	}

	private boolean checkSameCard( int[] hist, int n ){

		for( int i = 1; i <= 13; i++ ){
			if( hist[ i ] == n ){
				return true;
			}
		}
		return false;
	}

	private boolean checkFullHouse( int[] cards ){
		if(
				cards[ 0 ] == cards[ 1 ] &&
				( cards[ 1 ] == cards[ 2 ] || cards[ 2 ] == cards[ 3 ] ) &&
				cards[ 3 ] == cards[ 4 ]
		){
			return true;
		}
		return false;
	}

	private boolean checkStraight( int[] cards ){
		if(
				( cards[ 0 ] + 1 == cards[ 1 ] || cards[ 0 ] + 9 == cards[ 1 ] ) &&
				cards[ 1 ] + 1 == cards[ 2 ] &&
				cards[ 2 ] + 1 == cards[ 3 ] &&
				cards[ 3 ] + 1 == cards[ 4 ]
		){
			return true;
		}
		return false;
	}

	private boolean checkTwoPair( int[] hist ){
		int counter = 0;
		for( int i = 1; i <= 13; i++ ){
			if( hist[ i ] == 2 ){
				counter++;
			}
		}
		return ( counter == 2 ) ? true : false ;
	}

	/* Application Main Entry Point. */
	public static void main( String[] args ){
		new Main().run();
	}
}