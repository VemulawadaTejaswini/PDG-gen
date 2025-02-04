import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = s.nextInt();
		long min = Long.MAX_VALUE;
		for(int i = -100; i <= 100; i++) {
			long total = 0;
			for(int j = 0; j < n; j++) {
				long diff = Math.abs(i - a[j]);
				total += diff * diff;
			}
			min = Math.min(min, total);
		}
		System.out.println(min);
	}
}
