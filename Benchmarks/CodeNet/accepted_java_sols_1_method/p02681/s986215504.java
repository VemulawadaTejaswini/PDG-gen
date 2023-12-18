import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		String T = scan.next();

		if(T.length() == S.length() + 1 && S.equals(T.substring(0, S.length()))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}