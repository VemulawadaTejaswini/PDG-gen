
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
			int count = 0;
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				if (a > 0)
					count++;
				if (a > 1)
					flag = true;
			}
			System.out.println(flag ? count + 1 : "NA");
		}
	}
}