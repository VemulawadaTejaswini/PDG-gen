import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int q = scanner.nextInt();
			// init
			int[] sankasha = new int[n];
			for (int i = 0; i < n; i++) {
				sankasha[i] = k;
			}

			// calc
			for (int i = 0; i < q; i++) {
				int index = scanner.nextInt();
				sankasha[index-1]++;
			}

			for (int i = 0; i < n; i++) {
				System.out.println((sankasha[i] - q) > 0 ? "Yes" : "No");
			}
//			long end = System.currentTimeMillis();
//			System.out.println((end - start) + "ms");
		}
	}
}
