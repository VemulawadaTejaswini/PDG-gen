import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String first = s.substring(0, 1);
		String end = s.substring(3);

		String regex1 = "^%s{3}[0-9]$";
		regex1 = String.format(regex1, first);
		String regex2 = "^[0-9]%s{3}$";
		regex2 = String.format(regex2, end);

		if (s.matches(regex1) || s.matches(regex2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}