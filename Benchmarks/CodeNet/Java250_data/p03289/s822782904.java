import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		String ans = "AC";

		int c = 0;
		for (int i = 2; i < S.length() - 1; i++) {
			if (S.substring(i, i + 1).equals("C")) {
				c++;
			} else if (Character.isUpperCase(S.charAt(i))) {
				c = 2;
			}
		}

		if (Character.isUpperCase(S.charAt(1)) || Character.isUpperCase(S.charAt(S.length() - 1))
				|| !S.substring(0, 1).equals("A")
				|| S.substring(1, 2).equals("C")
				|| S.substring(S.length() - 1, S.length()).equals("C") || c != 1) {
			ans = "WA";
		}

		System.out.println(ans);
		sc.close();
	}

}
