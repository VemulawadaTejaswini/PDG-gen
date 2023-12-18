import java.util.Scanner;

public class Main {

	public static final long MOD = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] sum = new long[n];

			a[0] = sc.nextLong();
			sum[0] = a[0];
			for (int i = 1; i < n; i++) {
				a[i] = sc.nextLong();
				sum[i] = (sum[i - 1] + a[i]);
			}

			long result = 0;
			for (int i = 0; i < n - 1; i++) {
				long nokori = (sum[n - 1] - sum[i]);
				result = (result + (a[i] * nokori) % MOD) % MOD;
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}