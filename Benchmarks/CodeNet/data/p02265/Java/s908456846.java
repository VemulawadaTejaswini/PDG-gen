import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		String  str, ord;
		StringBuilder strbld = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			ord = scan.next();
			
			switch (ord) {
			case "insert":
				str = scan.next();
				strbld.insert(0, str);
				break;
			case "delete":
				str = scan.next();
				strbld.deleteCharAt(strbld.indexOf(str));
				break;
			case "deleteFirst":
				strbld.deleteCharAt(0);
				break;
			case "deleteLast":
				strbld.deleteCharAt(strbld.length() - 1);
			break;
			default:
				break;
			}
		}
		scan.close();
		for ( int i = 0; i < strbld.length(); i++) {
			if ( i == strbld.length() - 1) {
				System.out.println(strbld.charAt(i));
			} else {
				System.out.print(strbld.charAt(i) + " ");
			}
		}
	}
}

