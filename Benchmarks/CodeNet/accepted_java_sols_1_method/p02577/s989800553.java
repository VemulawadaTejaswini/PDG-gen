import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		int sum = 0;

		for (int i = 0; i < n.length(); i++) {

			int num = Integer.parseInt(n.substring(i, i + 1));

			sum = (sum + num) % 9;
		}

		if (sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}