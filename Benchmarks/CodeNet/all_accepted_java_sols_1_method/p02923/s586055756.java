import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			int m = src.nextInt();
			a[i] = m;
		}
		int time = 0, p = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] >= a[i + 1]) {
				p++;
			}
			if (time <= p) {
				time = p;
			}
			if (a[i] < a[i + 1]) {

				p = 0;
			}
		}
		System.out.println(time);
	}
}
