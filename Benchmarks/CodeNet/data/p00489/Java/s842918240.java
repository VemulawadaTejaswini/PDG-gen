import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		final int[] p = new int[n + 1];
		for (int i = 1; i <= n * (n - 1) / 2; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (c > d)
				p[a] += 3;
			else if (c < d)
				p[b] += 3;
			else {
				p[a]++;
				p[b]++;
			}
		}
		int r[] = new int[n + 1];
		Integer[] num = new Integer[n];
		for (int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		Arrays.sort(num, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return p[b] - p[a];
			}
		});
		// System.out.println(Arrays.toString(num));
		int rank = 0;
		int score = -1;
		for (int i = 0; i < n; i++) {
			if (score != p[num[i]]) {
				rank = i + 1;
				score = p[num[i]];
			}
			r[num[i]] = rank;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(r[i]);
		}
	}
}