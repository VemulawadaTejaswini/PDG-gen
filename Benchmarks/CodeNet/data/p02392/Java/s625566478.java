import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int first = Integer.parseInt( scaner.next() );
		int second= Integer.parseInt( scaner.next() );
		int third = Integer.parseInt( scaner.next() );

		String resultMessage = "No";

		if (  first < second && second < third ) {
			resultMessage = "Yes";
		}

		System.out.println( resultMessage );


		scaner.close();
	}

}