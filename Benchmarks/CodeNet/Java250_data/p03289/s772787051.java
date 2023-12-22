import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		boolean match = true;
		String s;
		match = match && S.substring(0, 1).equals("A");
		int cntC = 0;
		for (int i = 1; i < S.length(); i++) {
			s = S.substring(i, i + 1);

			if (i >= 2 && i < S.length() - 1) {
				if (s.equals("C")) {
					cntC++;
				}
			}
			if (!s.equals("C")) {
				match = match && s.matches("[a-z]");
			}
		}
		match = match && cntC == 1;
		System.out.println(match ? "AC" : "WA");
	}

}
