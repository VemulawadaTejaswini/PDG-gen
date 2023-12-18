
import java.util.Arrays;
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
			int sum = 0;
			for (int i = 0; i < n; i++)
				sum += scanner.nextInt();
			int[] js = new int[n - 1];
			for (int i = 0; i < n - 1; i++)
				sum += js[i] = scanner.nextInt();
			Arrays.sort(js);
			int max = sum;
			int jsum = 0;
			for (int i = 0; i < n - 1; i++) {
				jsum += js[i];
				max = Math.max(max, (i + 2) * (sum - jsum));
			}
			System.out.println(max);
		}
	}
}