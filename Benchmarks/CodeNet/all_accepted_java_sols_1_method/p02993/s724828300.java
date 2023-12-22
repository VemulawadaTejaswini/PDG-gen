import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char before = str.charAt(0);
		boolean result = false;
		for (int i = 1; i < 4; i++) {
			if (before == str.charAt(i)) {
				result = true;
				break;
			}
			before = str.charAt(i);
		}
		if (result) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}
	}
}
