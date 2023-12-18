
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[10];
			while (n-- > 0) {
				int a = scanner.nextInt();
				num[a]++;
			}
			for (int i = 0; i < 10; i++) {
				if (num[i] == 0)
					System.out.println("-");
				else {
					for (int j = 0; j < num[i]; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}