import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			num += Character.getNumericValue(c[i]);
		}
		int x = Integer.parseInt(s);
		if (x%num==0) {
			System.out.println("Yes");			
		} else {
			System.out.println("No");
		}
	}
}
