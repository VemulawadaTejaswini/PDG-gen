
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		long k = scan.nextLong();
		char result = 0;
		if (k >= str.length()) {
		} else {
			str = str.substring(0, (int) k );
		}
		for (int i = 0; i <= str.length() - 1; i++) {
			result = str.charAt(i);
			if (result != '1') {
				break;
			}
		}
		System.out.println(result);
	}

}
