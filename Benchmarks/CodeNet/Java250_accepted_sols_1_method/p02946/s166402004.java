import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int k,x;

		Scanner sc = new Scanner(System.in);

		k = sc.nextInt();
		x = sc.nextInt();

		int a = k-1;

		for (int i = 0; i < a; i++) {

			System.out.print(x - a + i + " ");

		}

		for (int i = 0; i <= a; i++) {

			if (i != a) {
				System.out.print(x + i + " ");
			} else {
				System.out.print(x + i);
			}

		}

	}
}
