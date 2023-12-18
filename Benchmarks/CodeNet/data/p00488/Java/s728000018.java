
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int ans = 3000;
		for (int i = 0; i < 3; i++)
			ans = Math.min(ans, scanner.nextInt());
		ans += Math.min(scanner.nextInt(), scanner.nextInt());
		System.out.println(ans - 50);
	}
}