import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt(), x = scanner.nextInt();
			if (n == 0 && x == 0) break;
			int cnt = 0;
			for (int i = 1; i <= n - 1; ++i) {
				for (int j = i + 1; j <= n; ++j) {
					int k = x - (i + j);
					if (i <= j && j <= k && 1 <= k && k <= n && k != i && k != j) ++cnt;
				}
			}
			System.out.printf("%d\n", cnt);
		}
	}
}

