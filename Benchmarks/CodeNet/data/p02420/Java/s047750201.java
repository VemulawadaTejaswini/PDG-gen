import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		final String END = "_";
		String word = "a", str;
		int m, h;
		
		while (true) {
			
			
			
			for (int i = 0; i < 2; i++) {
				h = scan.nextInt();
				str = word + word;
				int hh = h + word.length();
				word = str.substring(h, hh);
			}
			
			System.out.println(word);
			
		}
		
		scan.close();
		
	}
}

