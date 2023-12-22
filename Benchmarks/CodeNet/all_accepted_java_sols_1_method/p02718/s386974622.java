import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		double sum = 0.;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sum /= (4. * m);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] >= sum) {
				++count;
			}
		}
		if (count >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
