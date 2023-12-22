import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String a = "";
		int sum;

		Scanner sc = new Scanner(System.in);

		while (true) {
			sum = 0;
			a = sc.nextLine();

			if (a.equals("0")) {
				break;
			}

			for (int i = 0; i < a.length(); i++) {
				sum += Character.getNumericValue(a.charAt(i));
			}
			System.out.println(sum);
		}

		sc.close();
	}
}

