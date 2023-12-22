
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		int e = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			if (max < d) {
				max = d;
				e = c;
			} else if (max == d) {
				e = Math.min(e, c);
			}
		}
		System.out.println(e + " " + max);
	}
}