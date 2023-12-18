import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] v = new Integer[n];

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}

		Arrays.sort(v);
		double ans = 0;
		double mae = 0;
		for (int i = 1; i < n; i++) {
			if (i == 1) {
				mae = (double) (v[i] + v[i - 1]) / 2;

			} else {
				mae = (double) (mae + v[i]) / 2;

			}
			ans += mae;
		}
		System.out.println(mae);
		sc.close();

	}

}