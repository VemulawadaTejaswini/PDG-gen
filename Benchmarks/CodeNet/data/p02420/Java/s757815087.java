import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		final String END = "_";
		int shuffle;
		int replace;
		String word, str;
		
		while (scan.hasNext()) {
			
			word = scan.next();
			if (word.equals("_")) break;
			
			shuffle = scan.nextInt();
			
			for (int i = 0; i < shuffle; i++) {
				replace = scan.nextInt();
				str = word.substring(0, replace);
				word = word.replaceFirst(str, "");
				word += str;
				
			}
			
			System.out.println(word);
			
		} 
		
		scan.close();
		
	}
}

