
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String strN = String.valueOf(n);
		for (int i = 0; i < strN.length(); i++) {
			if (strN.charAt(i) == '7') {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
