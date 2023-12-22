
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 0;

		for (int i = 1; i <= N; i = i + 2) {
			int divisor = 0;

			for (int j = 1; j <= Math.sqrt(i); j++) {

				if (i % j == 0) {
					divisor++;
				}

			}

			if (divisor*2 == 8) {
				ans++;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}
