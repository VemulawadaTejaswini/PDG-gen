import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		long sum = 0;
		if (K >= a[0]) {
			sum += a[0];
			K -= a[0];
		} else {
			sum += K;
			K = 0;
		}
		if (K >= a[1]) {
			K -= a[1];
		} else {
			K = 0;
		}
		if (K >= a[2]) {
			sum -= a[2];
			K -= a[2];
		} else {
			sum -= K;
			K = 0;
		}
		System.out.println(sum);
	}
}
