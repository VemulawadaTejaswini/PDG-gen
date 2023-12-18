import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			long tmp = (long) i * i;
			if (tmp > n) {
				System.out.println((long) (i - 1) * (i - 1));
				return;
			}
		}
		
		System.out.println(1);
	}
}
