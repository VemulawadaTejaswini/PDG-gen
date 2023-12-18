import java.util.Scanner;

/*
 * AtCoder Beginner Contest 101 B
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int n = N;
		int S = 0;
		while (n > 0) {
			S += n % 10;
			n /= 10;
		}

		if (N % S == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
