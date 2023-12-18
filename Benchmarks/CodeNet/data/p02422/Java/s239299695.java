import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final String PRINT = "print";
		final String REVERSE = "reverse";
		final String REPLACE = "replace";
		int ord, a, b;
		String str, ordstr, repordstr, cutstr;
		
		str = scan.next();
		ord = scan.nextInt();
		
		for (int i = 0; i < ord; i++) {
			ordstr = scan.next();
			a = scan.nextInt();
			b = scan.nextInt() + 1;
			cutstr = str.substring(a, b);
			
			switch (ordstr) {
			case PRINT:
				System.out.println(cutstr);
				break;
			case REVERSE:
				StringBuffer revordstr = new StringBuffer(cutstr);
				str = str.replace(cutstr, revordstr.reverse().toString());
				break;
			case REPLACE:
				repordstr = scan.next();
				str = str.replace(cutstr, repordstr);
				break;
			default:
				break;
			}
			
		}
		
		scan.close();
	}
}
