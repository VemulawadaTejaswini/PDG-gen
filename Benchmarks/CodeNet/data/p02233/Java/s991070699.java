
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int[] num = new int[45];

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		num[0] = num[1] = 1;
		for (int i = 2; i <= n; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		System.out.println(num[n]);
	}

}