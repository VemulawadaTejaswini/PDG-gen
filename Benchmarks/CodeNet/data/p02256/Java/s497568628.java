import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		while (x > y)
			x = x % y;
		while (y > x)
			y = y % x;
		System.out.println(y == 0 ? x : y);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

