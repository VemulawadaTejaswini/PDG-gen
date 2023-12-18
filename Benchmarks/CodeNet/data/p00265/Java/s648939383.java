
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int a = scanner.nextInt();
			int max = 0;
			for (int j = 0; j < n; j++) {
				max = Math.max(max, num[j] % a);
			}
			System.out.println(max);
		}

	}
}