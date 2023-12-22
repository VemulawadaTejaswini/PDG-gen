import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		StringBuilder str = new StringBuilder ();
		
		final String word = scan.next();
		str.append(word);
		
		final String keyword = scan.next();
		scan.close();
		
		int i = str.indexOf(keyword);
		
		if (i != -1) {
			System.out.println(i);
			i = str.indexOf(keyword, i + 1);
			while (i != -1) {
				System.out.println(i);
				i = str.indexOf(keyword, i + 1);
			}
		}
		
	}
}

