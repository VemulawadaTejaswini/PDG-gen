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
			StringBuilder  newstr = new StringBuilder(str);
			cutstr = str.substring(a, b);
			
			switch (ordstr) {
			case PRINT:	
				System.out.println(cutstr);
				break;
			case REVERSE:
				StringBuffer revordstr = new StringBuffer(cutstr);
				str = newstr.replace(a, b,  revordstr.reverse().toString()).substring(0, newstr.length());
				break;
			case REPLACE:
				repordstr = scan.next();
				str = newstr.replace(a, b, repordstr).substring(0, newstr.length());
				break;
			default:
				break;
			}
			
		}
		
		scan.close();
	}
}
