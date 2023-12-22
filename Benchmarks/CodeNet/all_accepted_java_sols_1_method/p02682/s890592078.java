import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		long sum = 0l;
		while (a[0] > 0 && k > 0) {
			int min = Math.min(a[0], k);
			sum += min;
			k -= min;
			a[0] -= min;
		}
		while (a[1] > 0 && k > 0) {
			int min = Math.min(a[1], k);
			k -= min;
			a[1] -= min;
		}
		while (a[2] > 0 && k > 0) {
			int min = Math.min(a[2], k);
			sum -= min;
			k -= min;
			a[2] -= min;
		}
		System.out.println(sum);
	}
}
