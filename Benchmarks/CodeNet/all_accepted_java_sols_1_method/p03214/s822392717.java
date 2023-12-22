import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int[] d = new int[n];
		for (int i = 0; i < d.length; i++) {
			d[i] = Math.abs(sum - a[i]*n);
		}
		int min = Integer.MAX_VALUE;
		int ans = -1;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < min) {
				min = d[i];
				ans = i;
			}
		}
		System.out.println(ans);
	}
}