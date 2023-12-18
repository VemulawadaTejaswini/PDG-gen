
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();


		if (N.charAt(N.length() - 1) == '3') {
			System.out.println("bon");
		} else if (N.charAt(N.length() - 1) == '0' || N.charAt(N.length() - 1) == '1' || N.charAt(N.length() - 1) == '6'
				|| N.charAt(N.length() - 1) == '8') {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}

		scan.close();

	}
}
