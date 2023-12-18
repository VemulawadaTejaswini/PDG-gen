import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			if (n == 0 && x == 0)
				break;

			int x1;
			int k;
			int counter = 0;

			for (int i = 1;; i++) {
				x1 = x - i;
				if (i >= x1 || i > n)
					break;
				for (int j = i + 1;; j++) {
					k = x1 - j;
					if (j >= k)
						break;
					if (j <= n && k <= n)
						counter++;
				}
			}
			System.out.println(counter);
		}
	}
}