import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x == 0 && y == 0) break;
			if (x < y) {
				System.out.printf("%d %d\n", x, y);
			} else System.out.printf("%d %d\n", y, x);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}