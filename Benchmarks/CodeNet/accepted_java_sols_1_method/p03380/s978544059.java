import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
		}

		int min = max;
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == max) {
				continue;
			}
			int d = Math.abs(max / 2 - a[i]);
			if (d < min) {
				min = d;
				idx = i;
			}
		}
		System.out.println(max + " " + a[idx]);
	}
}
