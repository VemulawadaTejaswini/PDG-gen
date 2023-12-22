import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();
			if (n == 0)
				break;

			int ans = 0;
			int count = 0;

			for (int i = 1; i < n; i++) {
				for (int j = i; j < n; j++) {
					ans += j;
					if (ans == n)
						count++;
					if (ans >= n)
						break;
				}
				ans = 0;
			}
			System.out.println(count);
		}
		s.close();
	}
}