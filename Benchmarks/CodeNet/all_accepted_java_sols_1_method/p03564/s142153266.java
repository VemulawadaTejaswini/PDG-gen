import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int sc = 1;

		for (int i = 0; i < n; i++) {
			if (sc <= k) {
				sc *= 2;
			} else {
				sc += k;
			}
		}

		System.out.println(sc);
	}
}
