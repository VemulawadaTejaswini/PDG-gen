import java.util.Scanner;

public class Main {
	void call(int n) {
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.printf(" %d", i);
				continue;
			}
			do {
				if (x % 10 == 3) {
					System.out.printf(" %d", i);
					break;
				}
				x /= 10;
			} while(x >= 1);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Main m = new Main();
		Scanner scan = new Scanner(System.in);
		m.call(scan.nextInt());
	}
}