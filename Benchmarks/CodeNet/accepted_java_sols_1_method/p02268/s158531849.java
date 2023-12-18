import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scanner.nextInt();
		}

		int q = scanner.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = scanner.nextInt();
		}

		for (int i = 0; i < q; i++) {
			int index = T[i];
			int min = 0;
			int max = n - 1;
			int avg;
			while (true) {
				avg = (min + max) / 2;
				if (S[avg] == index) {
					count++;
					break;
				} else if (min > max) {
					break;
				} else {
					if (S[avg] < index) {
						min = avg + 1;
					} else {
						max = avg - 1;
					}
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
	