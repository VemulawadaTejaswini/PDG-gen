import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int width 	= Integer.parseInt( scaner.next() );
		int height 	= Integer.parseInt( scaner.next() );
		int x		= Integer.parseInt( scaner.next() );
		int y		= Integer.parseInt( scaner.next() );
		int r		= Integer.parseInt( scaner.next() );

		String resultMessage = "No";

		if ( ( x - r >= 0 ) && ( x + r <= width ) && ( y + r ) <= height && ( y - r) >= 0 ) {
			resultMessage = "Yes";
		}

		System.out.println( resultMessage );

		scaner.close();
	}
}