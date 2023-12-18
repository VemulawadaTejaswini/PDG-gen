
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int b = scanner.nextInt();
			int r = scanner.nextInt();
			int g = scanner.nextInt();
			int c = scanner.nextInt();
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			if (t == 0)
				break;
			int br = (b + r) * 15;
			int big = (b * 5 + r * 3) * 16;
			int ans = br + big + g * 7 + c * 2;
			ans = ans + 100 - (t - s)*3;
			System.out.println(ans);
		}
	}
}