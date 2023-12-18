import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int first = Integer.parseInt( scaner.next() );
		int secand= Integer.parseInt( scaner.next() );

		String sign = " == ";

		if ( first > secand ) {
			sign = " > ";
		}
		else if ( first < secand ) {
			sign = " < ";
		}

		System.out.println( first + String.valueOf(sign) + secand );

		scaner.close();
	}

}