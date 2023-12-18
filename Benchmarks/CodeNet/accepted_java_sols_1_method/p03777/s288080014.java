import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String answer = "D";

		if (a.equals("H")) {
			if (b.equals("H")) {
				answer = "H";
			} else if (a.equals("D")) {

			}
		} else if (a.equals("D")) {
			if (b.equals("H")) {

			} else if (a.equals("D")) {
				answer = "H";
			}
		}
		System.out.println(answer);

	}

}