import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		if (x - r < 0 || y - r < 0 || x + r > w || y + r > h) {
			System.out.println("No");
		} else System.out.println("Yes");
	}
	public static void main(String[] args) {
		new Main().run();
	}
}