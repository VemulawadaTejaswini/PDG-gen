
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int count = 0;
		while (m-- > 0) {
			int a = scanner.nextInt();
			if (Arrays.binarySearch(num, a) > -1)
				count++;
		}
		System.out.println(count);
	}
}