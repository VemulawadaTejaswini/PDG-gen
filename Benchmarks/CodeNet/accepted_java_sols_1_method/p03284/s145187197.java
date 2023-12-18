import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		scanner.close();

		if (N % K == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}