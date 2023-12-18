
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int q1 = scanner.nextInt();
			if (q1 == 0)
				break;
			int b = scanner.nextInt();
			int c1 = scanner.nextInt();
			int c2 = scanner.nextInt();
			int q2 = scanner.nextInt();
			int count = -1;
			for (int i = q2; i >= 1; i--) {
				int aa = i * c1;
				int bb = Math.max((q1 - i), 0) * c2;
				if (aa + bb <= b) {
					count = i;
					break;
				}
			}
			if (count == -1) {
				System.out.println("NA");
			} else {
				int ans = (b - count * c1) / c2;
				System.out.println(count + " " + ans);
			}
		}

	}
}