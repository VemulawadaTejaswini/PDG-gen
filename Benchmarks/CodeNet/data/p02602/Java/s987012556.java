import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int cnt = n - k + 1;
		long sum[] = new long[cnt];
		Arrays.fill(sum, 1);

		for (int i = k - 1; i < n; i++) {
			for (int j = i - k + 1; j <= i; j++) {
				sum[i - k + 1] *= a[j];
			}
		}

		for (int i = 1; i < cnt; i ++) {
			if (sum[i - 1] < sum[i]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}



		sc.close();
	}

}
