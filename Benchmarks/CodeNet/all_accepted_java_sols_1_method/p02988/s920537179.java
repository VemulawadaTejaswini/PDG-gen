
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
		}
		int count = 0;
		for (int i = 1; i < n - 1; i++) {
			if (p[i - 1] < p[i] && p[i] < p[i + 1]) {
				count++;
				continue;
			}
			if (p[i + 1] < p[i] && p[i] < p[i - 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
