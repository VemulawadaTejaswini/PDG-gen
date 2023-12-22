import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(N % 2 == 0 ? N : 2 * N);
		scanner.close();
	}
}