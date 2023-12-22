import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		String T = s.nextLine();
		int count = 0;

		if (S.charAt(0) == T.charAt(0)) {
			count += 1;
		}
		if (S.charAt(1) == T.charAt(1)) {
			count += 1;
		}
		if (S.charAt(2) == T.charAt(2)) {
			count += 1;
		}
		System.out.println(count);
	}
}