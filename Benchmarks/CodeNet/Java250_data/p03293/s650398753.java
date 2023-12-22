import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		scan.close();
		
		int len = S.length();
		char ch = T.charAt(0);
		
		for (int i = 0 ; i < len ; i++) {
			if (ch == S.charAt(i)) {
				String f = S.substring(i);
				String b = S.substring(0, i);
				if (T.equals(f + b)) {
					System.out.print("Yes");
					return;
				}
			}
		}
		
		System.out.print("No"); 
	}
}
