import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		int sub = b - a;

		if (k * 2 > sub) {
			for (int i = a; i < b + 1; i++) {
				System.out.println(i);
			}

		} else {

			for (int i = a; i < a + k; i++) {
				System.out.println(i);
			}

			for (int i = b - k + 1; i < b + 1; i++) {
				System.out.println(i);
			}
		}

		sc.close();

	}
}
