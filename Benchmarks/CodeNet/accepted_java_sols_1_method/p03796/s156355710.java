import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		long p = 1;
		for (int i = 1; i <= n; i++) {
			p = (long) ((long) (p % (Math.pow(10, 9) + 7) * (i % (Math.pow(10, 9) + 7))) % (Math.pow(10, 9) + 7));
		}
		System.out.println(p);

	}
}