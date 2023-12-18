import java.util.Scanner;

public class Shuffle {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		final String END = "_";
		int shuffle;
		int replace;
		String word, str;
		
		do {
			word = scan.next();
			shuffle = scan.nextInt();
			
			for (int i = 0; i < shuffle; i++) {
				replace = scan.nextInt();
				str = word.substring(0, replace);
				word = word.replaceFirst(str, "");
				word += str;
				
			} 
			
			System.out.println(word);
			
		} while (word.equals(END) == false );
		
		scan.close();
		
	}
}

