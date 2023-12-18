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
		
		while (true) {
			
			word = scan.next();
			if (word.equals(END)) break;
			
			scan.nextLine();
			charcter = new StringBuilder(word);
			shuffle = scan.nextInt();
			
			for (int i = 0; i < shuffle; i++) {
				replace = scan.nextInt();
				if ( replace == 1) {
					charcter.append(charcter.charAt(0));
					charcter.deleteCharAt(0);
				} else {
					charcter.append(charcter.substring(0, (replace)));
					charcter.delete(0, (replace)); 
				}
			}

			System.out.println(charcter);
			
		} 
		
		scan.close();
		
	}
}

