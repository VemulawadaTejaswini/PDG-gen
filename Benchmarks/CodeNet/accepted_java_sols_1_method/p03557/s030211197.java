import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		double[] c = new double[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(a);
		Arrays.parallelSort(c);

		long ans = 0L;
		for (int j = 0; j < n; j++) {
			long idxA = Arrays.binarySearch(a, b[j] - 0.1);
			idxA = ~idxA;
			long idxC = Arrays.binarySearch(c, b[j] + 0.1);
			idxC = ~idxC;
			ans += idxA * (n - idxC);
		}
		System.out.println(ans);
	}
}
