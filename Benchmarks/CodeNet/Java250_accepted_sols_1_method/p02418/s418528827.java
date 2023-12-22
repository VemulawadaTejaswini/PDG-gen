import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		String str, search_str;
		StringBuilder prostr;
		int result;
		
		str = scan.nextLine();
		search_str = scan.nextLine();
		
		prostr = new StringBuilder(str);
		prostr = prostr.append(str.substring(0, search_str.length()));
		
		result = prostr.indexOf(search_str);
		
		if ( result != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
				
		scan.close();
	}
}

