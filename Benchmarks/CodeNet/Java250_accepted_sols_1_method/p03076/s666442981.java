import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				if (i != j) {
					sum += a[j];
				}
				int m = sum % 10;
				if (m > 0) {
					sum += 10 - m;
				}
			}
			sum += a[i];
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
