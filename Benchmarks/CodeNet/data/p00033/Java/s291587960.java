// Ball
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int a = 0, b = 0;
			boolean x = true;
			for (int i = 0; i < 10; i++) {
				int d = sc.nextInt();
				if (a < d) {
					a = d;
					continue;
				}
				if (b < d) {
					b = d;
					continue;
				}
				x = false;
				break;
			}
			if (x)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}