import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		int cnt=0;
		String comp_word = "";
		String str ="";
		String sentence = "";

		Scanner sc= new Scanner( System.in );

		comp_word = sc.next();
		comp_word = comp_word.toLowerCase();

		while( true ) {
			str = sc.nextLine();


			if ( str.equals("END_OF_TEXT") ) {
				break;
			}

			str = str.toLowerCase();
			sentence += str;


		}

		Matcher matcher = Pattern.compile(comp_word).matcher(sentence);

        while  (matcher.find() ) {
        	cnt++;
        }

		System.out.println( cnt );

		sc.close();
	}
}


