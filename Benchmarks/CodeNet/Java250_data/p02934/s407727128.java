import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double denom = 0;
		int n = scanner.nextInt();
		for (int i = 0, a; i < n; i++) {
			a = scanner.nextInt();
			denom += (double) 1 / a;
		}
		System.out.println(1 / denom);

	}
}