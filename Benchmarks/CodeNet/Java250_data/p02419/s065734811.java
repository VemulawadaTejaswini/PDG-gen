import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cnt=0;
		String comp_word = "";
		String str = "";

		Scanner sc= new Scanner( System.in );

		comp_word = sc.next();
		comp_word = comp_word.toLowerCase();

		while( true ) {
			str = sc.next();


			if ( str.equals("END_OF_TEXT") ) {
				break;
			}

			str = str.toLowerCase();

			if( str.equals(comp_word) ) {
				cnt++;
			}

		}

		System.out.println( cnt );

		sc.close();
	}
}

