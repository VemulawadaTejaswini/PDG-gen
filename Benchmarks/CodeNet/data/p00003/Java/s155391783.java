import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		for (int T = sc.nextInt(); 0 < T; T--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			a *= a;
			b *= b;
			c *= c;
			if (a + b == c || a + c == b || b + c == a) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}