
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scanner.nextLine());
			if (n == 0) {
				break;
			}
			int[][] num = new int[n][2];
			for (int l = 0; l < n; l++) {
				StringTokenizer tokenizer = new StringTokenizer(
						scanner.nextLine());
				num[l][0] = Integer.parseInt(tokenizer.nextToken());
				int t = tokenizer.countTokens();
				int[] b = new int[t];
				int frame = 1;
				for (int i = 0; i < t; i++) {
					b[i] = Integer.parseInt(tokenizer.nextToken());
				}

				int j = 0;
				int sum = 0;
				while (j < b.length) {
					if (frame >= 10) {
						sum += b[j];
						j++;
					} else {
						sum += b[j] + b[j + 1];
						if (b[j] == 10) {
							sum += b[j + 2];
							j++;
						} else {
							if (b[j] + b[j + 1] == 10) {
								sum += b[j + 2];
							}
							j += 2;
						}
					}
					frame++;
				}
				num[l][1] = sum;
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
			for (int[] a : num) {
				System.out.println(a[0] + " " + a[1]);
			}
		}
	}
}