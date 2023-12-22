import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			int x = s.nextInt();
			int c = 0;
			if (n == 0 && x == 0) return;

			for (int i = 1; i <= n; ++i) {
				for (int j = i + 1; j <= n; ++j) {
					for (int k = j + 1; k <= n; ++k) {
						int sum = i + j + k;
						if (sum == x) {
							c++;
						} else if (sum > x) {
							break;
						}
					}
				}
			}
			System.out.println(c);
		}
	}
}