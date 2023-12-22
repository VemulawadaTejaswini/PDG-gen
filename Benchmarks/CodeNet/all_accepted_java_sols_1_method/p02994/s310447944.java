import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		int sum1 = 0;
		for (int i = 0; i < N; i++) {
			sum1 += L + (i + 1) - 1;
		}
		//System.out.println(sum1);

		int sa = 100000;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int sum2 = 0;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				sum2 += L + (j + 1) - 1;
			}

			sa = Math.min(sa, Math.abs(sum1 - sum2));
		}

		if(L > 0) {
			ans = sum1 - sa;
		} else {
			ans = sum1 + sa;
		}

		System.out.println(ans);
	}
}