import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n + 1];
		Set<Integer> light = new HashSet<>();
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			if (a[i] > 0) {
				light.add(i);
			}
		}
		sc.close();
		int[] b = new int[n + 1];
		do {
			for (int i : light) {
				int min = (i - a[i]) < 1 ? 1 : (i - a[i]);
				int max = (i + a[i]) > n ? n : (i + a[i]);
				for (int j = min; j <= max; j++) {
					b[j]++;
				}
			}
			for (int i = 1; i <= n; i++) {
				if (a[i] == 0) {
					a[i] = b[i] + 1;
					light.add(i);
				} else {
					a[i] = b[i];
				}
			}
			b = new int[n + 1];
		} while (--k != 0);

		for (int i = 1; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n]);
	}
}
