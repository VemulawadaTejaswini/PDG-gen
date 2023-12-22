
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			int q = sc.nextInt();

			int[] narr = new int[n];
			for (int i = 0; i < q; i++) {
				narr[sc.nextInt() - 1]++;
			}

			for (int i : narr) {
				if (k - (q - i) <= 0) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			}
		}
	}
}
