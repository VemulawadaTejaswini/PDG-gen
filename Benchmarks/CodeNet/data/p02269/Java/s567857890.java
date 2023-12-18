import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final String INSERT = "insert";
		final String FIND = "find";
		final int n = scan.nextInt();
		
		ArrayList<String> str = new ArrayList<String>();
	
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();

			if ( ord.equals(INSERT)) {
				str.add(scan.next());
			} else if (ord.equals(FIND)) {
				final String word = scan.next();
				if (str.contains(word)) System.out.println("yes");
				else System.out.println("no");
			}
		}
		scan.close();
	}
}

