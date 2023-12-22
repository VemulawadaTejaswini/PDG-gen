import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextLong();
		for (int i = 0; i < n; i++) b[i] = sc.nextLong();
		for (int i = 0; i < n; i++) c[i] = sc.nextLong();

		Arrays.sort(a);
		Arrays.sort(c);

		long answer = 0;
		for (int i = 0; i < n; i++) {
			long ai = Arrays.binarySearch(a, b[i] - 0.1);
			long ci = Arrays.binarySearch(c, b[i] + 0.1);

			answer += (-1 - ai) * (n + ci + 1);
		}

		System.out.println(answer);
	}
}
