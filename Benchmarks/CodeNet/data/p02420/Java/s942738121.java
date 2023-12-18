import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder charcter;
		final String END = "_";
		int shuffle;
		int replace;
		String word;
		
		do {
			word = scan.nextLine();
			if (word.equals(END)) break;
			
			charcter = new StringBuilder(word);
			shuffle = scan.nextInt();
			
			for (int i = 0; i < shuffle; i++) {
				replace = scan.nextInt();
				if ( replace == 1) {
					charcter.append(word.charAt(0));
					charcter.deleteCharAt(0);
				} else {
					charcter.append(charcter.substring(0, (replace - 1)));
					charcter.delete(0, (replace - 1)); 
				}
			}
			
			System.out.println(charcter);
			
		} while (scan.hasNext());
		
		scan.close();
		
	}
}

