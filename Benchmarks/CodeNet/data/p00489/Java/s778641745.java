import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		for (int i = 0; i < n; i++)
			r[i] = 0;
		for (int i = 0; i < n * (n - 1) / 2; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (c > d)
				r[a - 1] += 3;
			if (c < d)
				r[b - 1] += 3;
			if (c == d) {
				r[a - 1]++;
				r[b - 1]++;
			}
		}
		int[] rank = new int[n];
		for (int i = 0; i < n; i++)
			rank[i] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (r[i] > r[j]) {
					rank[j]++;
				}
				if (r[i] < r[j])
					rank[i]++;
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(rank[i]);
	}
}