import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];

		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		Arrays.sort(l);
		Arrays.sort(r);

		if (l[m - 1] > r[0]) {
			System.out.println(0);
		} else {
			System.out.println(r[0] - l[m - 1] + 1);
		}
		sc.close();
	}
}