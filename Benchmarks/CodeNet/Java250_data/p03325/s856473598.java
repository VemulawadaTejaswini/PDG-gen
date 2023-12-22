import java.util.Scanner;

/*
 * AtCoder Beginner Contest 100 C
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int count_even = 0;
		for (int i = 0; i < N; i++) {
			int a = scanner.nextInt();
			while (a % 2 == 0) {
				a /= 2;
				count_even++;
			}
		}

		System.out.println(count_even);

	}

}