import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();
		scanner.close();

		boolean flag = false;

		for (int n = 0; n < S.length(); n++) {
			if (S.equals(T)) {
				flag = true;
				break;
			}

			String s = S.substring(S.length() - 1, S.length());
			S = S.substring(0, S.length() - 1);
			S = s + S;
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}