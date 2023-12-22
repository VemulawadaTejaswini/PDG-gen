import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < String.valueOf(b).length(); i++) {
			a *= 10;
		}

		int c = a + b;

		if ((int) Math.sqrt(c) * (int) Math.sqrt(c) == c) {
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}
	}

}
