import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if (n == 0 && p == 0) {
				break;
			}

			int[] player = new int[n];
			for (int i = 0; i < n; i++) {
				player[i] = 0;

			}

			int index = 0;
			int wan = p;

			while (true) {
				if (wan > 0) {
					player[index % n]++;
					wan--;
					if (player[index % n] == p) {
						break;
					}
				} else {
					wan += player[index % n];
					player[index % n] = 0;
				}
				index++;
			}

			System.out.println(index % n);
		}
	}
}