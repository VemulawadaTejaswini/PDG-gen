import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int minsum = Integer.MAX_VALUE;

		for (int i = a[0]; i <= a[n - 1]; i++) {
			int tmpsum = 0;
			for (int j = 0; j < n; j++) {
				tmpsum += Math.abs((a[j] - i) * (a[j] - i));
				//System.out.println("i=" + i + ", j=" + j + ", a[j]=" + a[j] + ", tmpsum=" + tmpsum);
			}
			if (minsum > tmpsum) {
				minsum = tmpsum;
			}
		}

		System.out.print(minsum);

		sc.close();
	}
}