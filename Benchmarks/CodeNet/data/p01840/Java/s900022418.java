import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int sum = 0;

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		sc.close();

		sum += (a[0] - m);

		for (int i = 0; i < n - 1; i++) {
			int shortStudyTime = (a[i + 1] - a[i] - 2 * m);
			if (shortStudyTime > 0) {
				sum += shortStudyTime;
			}
		}

		int lastStudyTime = (t - a[n - 1] - m);

		if (lastStudyTime > 0) {
			sum += lastStudyTime;
		}

		System.out.println(sum);

	}

}
