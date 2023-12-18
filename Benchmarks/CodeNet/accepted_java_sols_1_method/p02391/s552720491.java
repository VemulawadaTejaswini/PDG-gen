import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int first = Integer.parseInt( scaner.next() );
		int secand= Integer.parseInt( scaner.next() );

		String sign = "a == b";

		if ( first > secand ) {
			sign = "a > b";
		}
		else if ( first < secand ) {
			sign = "a < b";
		}

		System.out.println( sign );

		scaner.close();
	}

}