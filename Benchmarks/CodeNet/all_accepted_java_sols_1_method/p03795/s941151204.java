import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int x = 800 * N;
		int y = 200 * (N / 15);

		System.out.println(x - y);
	}

}