import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Sa = sc.next();
		String Sb = sc.next();
		String Sc = sc.next();

		char card = Sa.charAt(0);
		Sa = Sa.substring(1, Sa.length());

		while (true) {

			if (card == 'a') {
				if (Sa.length() == 0) {
					System.out.println("A");
					break;
				} else {
					card = Sa.charAt(0);
					Sa = Sa.substring(1, Sa.length());
				}
			} else if (card == 'b') {
				if (Sb.length() == 0) {
					System.out.println("B");
					break;
				} else {
					card = Sb.charAt(0);
					Sb = Sb.substring(1, Sb.length());
				}
			} else {
				if (Sc.length() == 0) {
					System.out.println("C");
					break;
				} else {
					card = Sc.charAt(0);
					Sc = Sc.substring(1, Sc.length());
				}
			}
		}
	}
}