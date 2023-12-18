import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long bef = 0;
		long aft = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					if (i < j) {
						bef++;
					} else {
						aft++;
					}
				}
			}
		}
		long b = k * (k + 1) / 2 % 1000000007;
		long c = k * (k - 1) / 2 % 1000000007;
		long d = bef * b % 1000000007 + aft * c % 1000000007;
		System.out.println(d % 1000000007);
	}
}
