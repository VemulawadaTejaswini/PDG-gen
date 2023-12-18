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

		// 3, 4
		// 6, 7
		// 4, 6
		int arr[][] = new int[m][2];
		int coal[] = new int[m];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			coal[i] = Math.min(a, b) * 10 + Math.max(a, b);
		}

		for (int i = 0; i < m; i++) {
			arr[i][0] = coal[i] / 10;
			arr[i][1] = coal[i] % 10;
		}

		int groupNo = 0;
		for (int i = 0; i < m; i++) {
			int a = arr[i][0];
			int b = arr[i][1];

			if (x[a] == none && x[b] == none) {
				groupNo++;
				x[a] = groupNo;
				x[b] = groupNo;
			} else {
				if (x[a] == none) x[a] = x[b];
				if (x[b] == none) x[b] = x[a];
			}
		}

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
