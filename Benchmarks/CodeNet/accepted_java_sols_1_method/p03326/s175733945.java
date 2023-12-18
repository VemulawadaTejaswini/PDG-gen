import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] sign = { { 1, 1, 1 }, { 1, 1, -1 }, { 1, -1, 1 }, { -1, 1, 1 }, { 1, -1, -1 }, { -1, 1, -1 },
				{ 1, -1, -1 }, { -1, -1, -1 } };
		long[] x = new long[n];
		long[] y = new long[n];
		long[] z = new long[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			z[i] = sc.nextLong();
		}
		Long max = Long.MIN_VALUE;
		Long maxtmp;
		Long[] tmp = new Long[n];
		for (int i = 0; i < 8; i++) {
			maxtmp = (long) 0;
			for (int j = 0; j < n; j++) {
				tmp[j] = x[j] * sign[i][0] + y[j] * sign[i][1] + z[j] * sign[i][2];
			}
			Arrays.sort(tmp);
			for (int j = n - 1; j > n - 1 - m; j--) {
				maxtmp += tmp[j];
			}
			max = Math.max(max, maxtmp);
		}
		System.out.println(max);
	}
}