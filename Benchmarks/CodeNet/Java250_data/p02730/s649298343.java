import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();

		if (s.substring(0, n / 2).equals(s.substring((n + 3) / 2-1, n))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}
}