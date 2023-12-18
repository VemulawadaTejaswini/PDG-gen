
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int ans = a * 4 + b * 2 + c;
		System.out.println(ans == 6 || ans == 1 ? "Open" : "Close");
	}
}