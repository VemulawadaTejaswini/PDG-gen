import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		long z = scanner.nextLong();
		long w = scanner.nextLong();

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		if(n>=2) {
			System.out.println(Math.max(Math.abs(a[n - 1] - w), Math.abs(a[n - 2] - a[n - 1])));
		}else{
			System.out.println(Math.abs(a[0] - w));
		}
	}
}