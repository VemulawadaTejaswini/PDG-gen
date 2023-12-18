import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		double average = sum / n;
		double min = 101;
		int minIdx = -1;
		for (int i = 0; i < n; i++) {
			if (min > Math.abs(average - a[i])) {
				min = Math.abs(average - a[i]);
				minIdx = i;
			}
		}
		System.out.println(minIdx);
	}
}