
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scanner.nextLine());
			if (n == 0) {
				break;
			}
			int[][] num = new int[n][2];
			for (int i = 0; i < n; i++) {
				String[] s = scanner.nextLine().split(" ");
				int[] b = new int[s.length - 1];
				num[i][0] = Integer.parseInt(s[0]);
				int frame = 1;
				for (int j = 1; j < s.length; j++) {
					b[j - 1] = Integer.parseInt(s[j]);
				}
				int j = 0;
				while (j < b.length) {
					if (frame >= 10) {
						num[i][1] += b[j];
						j++;
					} else {
						num[i][1] += b[j] + b[j + 1];
						if (b[j] == 10) {
							num[i][1] += b[j + 2];
							j++;
						} else {
							if (b[j] + b[j + 1] == 10) {
								num[i][1] += b[j + 2];
							}
							j += 2;
						}
					}
					frame++;
				}

			}
			Arrays.sort(num, new Comparator<int[]>() {

				@Override
				public int compare(int[] a, int[] b) {
					if (a[1] == b[1]) {
						return a[0] - b[0];
					}
					return b[1] - a[1];
				}
			});
			for (int i = 0; i < n; i++) {
				System.out.println(num[i][0] + " " + num[i][1]);
			}

		}
	}
}