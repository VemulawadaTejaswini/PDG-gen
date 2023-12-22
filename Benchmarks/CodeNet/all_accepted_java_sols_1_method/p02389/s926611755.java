import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int x1	= Integer.parseInt( scaner.next());
		int x2	= Integer.parseInt( scaner.next());

		System.out.print( Math.multiplyExact( x1, x2 ) + " " );

		System.out.println( (x1 * 2) + (x2 * 2) );
	}

}