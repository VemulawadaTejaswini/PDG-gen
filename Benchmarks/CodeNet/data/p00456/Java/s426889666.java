
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			int[] num = new int[10];
			for (int j = 0; j < 10; j++) {
				num[j] = scanner.nextInt();
			}
			Arrays.sort(num);
			int ans = 0;
			for (int j = 9; j > 6; j--)
				ans += num[j];
			System.out.println(ans);
		}
	}
}