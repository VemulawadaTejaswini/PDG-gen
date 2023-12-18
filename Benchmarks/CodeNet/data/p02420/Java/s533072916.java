import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		final String END = "_";
		String word, str;
		int m, h;
		
		while (true) {
			
			word = scan.next();
			if (word.equals(END)) break;
			
			m = scan.nextInt();
			
			for (int i = 0; i < m; i++) {
				h = scan.nextInt();
				str = word + word;
				int hh = h + word.length();
				word = str.substring(h, (h + hh);
			}
			
			System.out.println(word);
			
		}
		
		scan.close();
		
	}
}

