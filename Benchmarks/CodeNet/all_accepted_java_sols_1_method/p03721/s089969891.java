import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		long[] num = new long[100_000 + 1];

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			num[a] += b;
		}

		int ans = 0;
		long sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if (sum >= k) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
