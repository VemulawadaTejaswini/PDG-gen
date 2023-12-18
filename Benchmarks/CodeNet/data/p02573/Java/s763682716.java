import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		final int none = 200001;
		int x[] = new int[200001];
		Arrays.fill(x, none);

		int group = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (x[a] == none && x[b] == none) {
				group++;
				x[a] = group;
				x[b] = group;
			} else {
				if (x[a] == none) x[a] = x[b];
				if (x[b] == none) x[b] = x[a];
			}
		}

//		for (int i = 1; i < n + 1; i++) {
//			System.out.println(x[i]);
//		}

		Arrays.sort(x);

		int max = 1;
		int cnt = 1;
		for (int i = 1; i <= n; i++) {
			if (x[i] == none) continue;
			if (x[i - 1] == x[i]) {
				cnt++;
				max = Math.max(max, cnt);
			} else {
				cnt = 1;
			}
		}

		System.out.println(max);


		sc.close();

	}

}
