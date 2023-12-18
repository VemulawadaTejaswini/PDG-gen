import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[][] task = new long[n][2];

		for (int i = 0; i < n; i++) {
			task[i][0] = sc.nextInt();
			task[i][1] = sc.nextInt();
		}

		Arrays.sort(task, (a, b) -> (Long.compare(a[1], b[1])));

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += task[i][0];
			if (sum > task[i][1]) {
				System.out.println("No");
				sc.close();
				return;
			}
		}

		System.out.println("Yes");

		sc.close();
	}

}
