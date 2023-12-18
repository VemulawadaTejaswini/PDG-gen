import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, w;
		int arrow[];
		int kk[];
		boolean flag;
		int max;

		while (true) {
			n = sc.nextInt();
			w = sc.nextInt();
			if ((n | w) == 0) {
				break;
			}
			arrow = new int[n + 1];
			kk = new int[(n + 1) * (n + 1)];
			max = 0;

			arrow[0] = 0;
			for (int i = 1; i <= n; i++) {
				arrow[i] = sc.nextInt();
			}

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					kk[i * (n + 1) + j] = arrow[i] + arrow[j];
				}
			}

			Arrays.sort(kk);
			int index = 0;
			for (int i = 0; i < kk.length - 1; i++) {
				if (kk[i] != kk[i + 1]) {
					kk[index++] = kk[i];
				}
			}
			kk[index++] = kk[kk.length - 1];

			for (int i = 0; i < index; i++) {
				for (int j = 0; j < index; j++) {
					if (kk[i] + kk[j] <= w && max < kk[i] + kk[j]) {
						max = kk[i] + kk[j];
					}
				}
			}

			System.out.println(max);
		}
	}
}