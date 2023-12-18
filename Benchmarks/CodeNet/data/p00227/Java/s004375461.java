
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			int[] num = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
				sum += num[i];
			}
			int mod = n % m;
			Arrays.sort(num);

			for (int i = mod; i < n; i += m) {
				sum -= num[i];
			}
			System.out.println(sum);
		}
	}
}