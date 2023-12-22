import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int combi = n * n - n;
		if (n < 3) {
			System.out.println("1");
			System.exit(0);
		}
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		int[] a = new int[combi];
		int[] b = new int[combi];
		int tmp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) {continue;}
				a[tmp] = x[i] - x[j];
				b[tmp] = y[i] - y[j];
				tmp++;
			}
		}

		int maxCount = 0;
		for (int i = 0; i < combi; i++) {
			int count = 1;
			for (int j = i+1; j < combi; j++) {
				if (a[i] == a[j] && b[i] == b[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
		}

		System.out.println(n - maxCount);

	}
}