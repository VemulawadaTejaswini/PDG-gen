import java.util.Scanner;

public class Main {

	public static void main(String...args) {

		String result = "No";
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i : list) {
				if (n % i == 0 && n / i < 10) {
					result = "Yes";
					break;
				}
			}

			System.out.println(result);
		}
	}

}
