
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int ans  =a%b;
			System.out.println(ans == 0 ? b : ans);
		}
	}
}