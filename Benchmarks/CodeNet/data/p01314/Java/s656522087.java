import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[1005];
		for (int i = 1; i < 1005; i++) {
			t[i] = t[i - 1] + i;
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int cnt = 0;
			for (int i = 0; i < 1005; i++) {
				for (int j = i + 2; j < 1005; j++) {
					if (t[j] - t[i] == n) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}