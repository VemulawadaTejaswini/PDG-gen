
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		for (int i = 0; i < 4; i++)
			ans += scanner.nextInt();
		System.out.println(ans / 60);
		System.out.println(ans % 60);
	}
}