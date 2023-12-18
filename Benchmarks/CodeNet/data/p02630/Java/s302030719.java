
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int b = sc.nextInt();
				int c = sc.nextInt();

				long result = 0;
				for (int j = 0; j < n; j++) {
					if (a[j] == b) {
						a[j] = c;
					}
					result += a[j];
				}
				System.out.println(result);
			}
		}
	}
}
