import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int sum[] = new int[n];

		for (int i = 1; i < n; i++) {
			if ("AC".equals(s.substring(i - 1, i + 1))) {
				sum[i] = sum[i - 1] + 1;
			} else {
				sum[i] = sum[i - 1];
			}
		}

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			System.out.println(sum[r - 1] - sum[l - 1]);
		}

		sc.close();

	}

}
