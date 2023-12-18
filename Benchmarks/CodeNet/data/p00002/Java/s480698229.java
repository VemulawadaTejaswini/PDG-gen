import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int ans = 0;
			a += b;
			while (a > 0) {
				ans++;
				a /= 10;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}