import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> charcter = new ArrayList<String>();
		final String END = "END_OF_TEXT";
		int count = 0;
		int i = 0;
		String sentence;
		
		String word = scan.nextLine();
		
		do {
			
			sentence = scan.next();
			charcter.add(sentence);
			
			if (sentence.equals(END)) break;
			
			if ( sentence.equalsIgnoreCase(word)) count++;
			
		} while(scan.hasNext());
		
		System.out.println(count);
		
	}
}
