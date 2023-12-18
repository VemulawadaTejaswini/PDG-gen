import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int max = m;
		int f = 1;
		for (int i = 0; i < n; i++) {
			m += scanner.nextInt() - scanner.nextInt();
			if (m > max) {
				max = m;
			}
			if (m < 0) {
				f = 0;
			}
		}
		scanner.close();
		System.out.println(f > 0 ? max : 0);
	}

}

