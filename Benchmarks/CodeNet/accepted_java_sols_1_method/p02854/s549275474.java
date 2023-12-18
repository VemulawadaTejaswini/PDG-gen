import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		long[] a = new long[n];
		a[0] = sc.nextLong();
		for (int i = 1; i < n; i++) {
			a[i] = sc.nextLong()+a[i-1];
		}
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n-1; i++) {
			min = Math.min(min, Math.abs(a[i]-(a[n-1]-a[i])));
		}
		System.out.println(min);
		sc.close();
	}
}