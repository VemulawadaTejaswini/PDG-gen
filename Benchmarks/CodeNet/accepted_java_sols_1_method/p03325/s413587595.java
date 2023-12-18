import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;

		for (int i = 0; i < N; i++) {

			int a = sc.nextInt();

			while (a % 2 == 0) {
				count++;
				a = a / 2;
			}
		}

		System.out.println(count);
	}
}
