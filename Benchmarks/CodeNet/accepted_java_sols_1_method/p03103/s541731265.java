import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (c, b) -> c[0] - b[0]);
		long sum = 0;
		int idx = 0;
		while (m != 0) {
			if (m - a[idx][1] >= 0) {
				m = m - a[idx][1];
				sum += (long) a[idx][1] * a[idx][0];
				idx++;
			} else {
				sum += (long)a[idx][0] * m;
				m = 0;
			}
		}
		System.out.println(sum);
	}
}
