import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str="";
		int sum;

		Scanner sc= new Scanner( System.in );

		while ( true) {
			sum = 0;
			str = sc.nextLine();

			if ( str.equals("0") ) {
				break;
			}

			for ( int i = 0 ; i < str.length() ; i++ ) {
				sum += Character.getNumericValue( str.charAt(i) );
			}
			System.out.println( sum );
		}

		sc.close();
	}
}

