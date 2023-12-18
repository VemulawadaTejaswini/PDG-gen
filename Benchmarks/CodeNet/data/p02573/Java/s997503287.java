import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[] = new int[200001];
		Arrays.fill(x, 200001);

		int group = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (x[a] == 200001 && x[b] == 200001) {
				group++;
				x[a] = group;
				x[b] = group;
			} else if (x[a] != 200001 || x[b] != 200001) {
				if (x[a] == 200001) x[a] = x[b];
				if (x[b] == 200001) x[b] = x[a];
			}
		}

//		for (int i = 1; i < n + 1; i++) {
//			System.out.println(x[i]);
//		}

		Arrays.sort(x);

		int max = 0;
		int cnt = 1;
		for (int i = 1; i <= m; i++) {
			if (x[i - 1] == 200001) continue;
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