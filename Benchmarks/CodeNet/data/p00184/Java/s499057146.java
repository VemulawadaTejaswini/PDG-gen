
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] age = new int[7];
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				age[a > 60 ? 6 : a / 10]++;
			}
			for (int t : age)
				System.out.println(t);
		}

	}
}