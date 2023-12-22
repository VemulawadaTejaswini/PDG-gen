import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String code = "Good";
		for (int i = 0; i < 3; i++) {
			if (S.charAt(i) == S.charAt(i + 1)) {
				code = "Bad";
			}
		}
		System.out.println(code);
	}

}