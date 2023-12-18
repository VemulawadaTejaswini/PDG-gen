
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = scanner.nextInt();
		Arrays.sort(num);
		System.out.println(1);
		int x = 2;
		loop: while (x * 2 <= num[0]) {
			for (int i = 0; i < n; i++) {
				if (num[i] % x != 0) {
					x++;
					continue loop;
				}
			}
			System.out.println(x);
			x++;

		}
	}
}