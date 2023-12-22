import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10000; i++) {
			String line = sc.nextLine();
			int n = Integer.parseInt(line);
			System.out.println("Case" + " " + i + ":" + " " + n);

			if (n == 0) {
				break;
			}

		}

	}

}