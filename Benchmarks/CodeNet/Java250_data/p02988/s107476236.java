
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		int p[] = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 1; i < n - 1; i++) {
			if (p[i - 1] < p[i] && p[i] < p[i + 1]) {
				count++;
			} else if (p[i - 1] > p[i] && p[i] > p[i + 1]) {
				count++;
			}
		}
		System.out.print(count);
	}
}
