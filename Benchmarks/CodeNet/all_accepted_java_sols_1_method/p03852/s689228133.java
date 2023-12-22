import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String c = sc.next();

			String regex = "^[a|e|i|o|u]$";
			if (c.matches(regex)) {
				System.out.println("vowel");
			} else {
				System.out.println("consonant");
			}

		} finally {
			sc.close();
		}
	}
}