import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int cnt = 0;
		final String INSERT = "insert";
		final String FIND = "find";
		final int n = scan.nextInt();
		
		HashMap<String, Integer> str = new HashMap<String, Integer>();
	
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();

			if ( ord.equals(INSERT)) {
				str.put(scan.next(), cnt);
				cnt++;
				
			} else if (ord.equals(FIND)) {
				
				final String word = scan.next();
				
				if (str.containsKey(word)) System.out.println("yes");
				else System.out.println("no");
			}
		}
		scan.close();
	}
}

