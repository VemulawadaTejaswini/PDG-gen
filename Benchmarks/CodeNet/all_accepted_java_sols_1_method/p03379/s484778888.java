import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = x[i];
		}
		Arrays.sort(y);
		int smaller = y[n / 2 - 1];
		int larger = y[n / 2];

		for (int i = 0; i < n; i++) {
			if (smaller != larger) {
				if (x[i] <= smaller) {
					System.out.println(larger);
				} else if (x[i] >= larger) {
					System.out.println(smaller);
				}
			} else {
				System.out.println(smaller);
			}
		}

		System.out.println();

		sc.close();
	}
}