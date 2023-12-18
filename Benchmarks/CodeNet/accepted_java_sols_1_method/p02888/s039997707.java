import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] l = new double[n];
		for (int i = 0; i < n; i++) {
			l[i] = in.nextInt();
		}
		Arrays.sort(l);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long count = Arrays.binarySearch(l, l[j] + l[i] - 0.1);
				if (count < 0) {
					count = ~count;
				}
				ans += Math.max(count - (j + 1), 0);
			}
		}
		System.out.println(ans);
		in.close();
	}
}