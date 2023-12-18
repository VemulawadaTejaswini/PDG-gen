import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer count = 0;
		while (true) {

			count++;

			Integer a = sc.nextInt();

			if (a == 0) {
				return;
			}

			System.out.println("Case " + count + ": " + a);

		}

	}

}

