
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main( String[] args ) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			String tmp = br.readLine();
			int numbersSize = Integer.parseInt(tmp);

			String tmp2 = br.readLine();
			String[] plainNumber = tmp2.split(" ");
			int[] Numbers = new int[plainNumber.length];

			for( int i = 0; i < plainNumber.length; i++ ) {
				Numbers[i] = Integer.parseInt(plainNumber[i]);
			}

			if( numbersSize <= 100 ) {
				for(int i = ( Numbers.length - 1 ); i > 0; i--) {
					System.out.print( Numbers[i] + " ");
				}
				System.out.println( Numbers[0] );
			}

		} catch( IOException e ) {
			e.printStackTrace();
		}
	}
}