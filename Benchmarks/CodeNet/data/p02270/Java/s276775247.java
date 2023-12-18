import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int wMax, wSum, w[] = new int[n];
		wMax = wSum = w[0] = sc.nextInt();
		for (int i = 1; i < n; i++) {
			wSum += w[i] = sc.nextInt();
			if (w[i] > wMax)
				wMax = w[i];
		}
		sc.close();

		if (k == 1) {
			System.out.println(wSum);
			return;
		}

		int pMax = max(wMax, wSum / k);
		L: for (int p = pMax; p <= wSum; p++) {
			int hold = 0, track = 1;

			for (int w_i : w) {
				if (hold + w_i > p) {
					hold = w_i;
					track++;
					if (track > k)
						continue L;
				} else {
					hold += w_i;
				}

			}

			if (track <= k) {
				System.out.println(p);
				break;
			}
		}
	}

	private static int max(int x, int y) {
		return x < y ? y : x;
	}
}
