import java.util.Scanner;

public class Main {
	int n;
	int[] deg;

	boolean check() {
//		for (int i = 0; i < deg.length; i++) {
//			System.out.println(deg[i]);
//		}
		int cnt = 0;
		for (int i = 0; i < deg.length; i++) {
			if (deg[i] % 2 == 1) {
				cnt++;
			}
		}

		return cnt <= 2;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			deg = new int['Z' - 'A' + 1];
			for (int i = 0; i < n; i++) {
				char[] c = sc.next().toCharArray();
				deg[c[0] - 'a']++;
				deg[c[c.length - 1] - 'a']++;
			}

			if (check()) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}