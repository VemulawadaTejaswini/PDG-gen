import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];

		IntStream.range(0, n).forEach(i -> a[i] = sc.nextInt());

		int sum = x;
		for (int i = 0; i < n; i++) {
			if ((d % a[i]) == 0) {
				sum += (d / a[i]);
			} else {
				sum += (d / a[i]) + 1;
			}
		}
		System.out.println(sum);
	}
}