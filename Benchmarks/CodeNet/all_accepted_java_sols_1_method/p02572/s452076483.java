import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		long sumJ = 0;
		for (int j = 1; j < n; j++)
			sumJ += a[j];
		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			long aj = sumJ % 1000000007L;
			ans += (long) a[i] * aj;
			ans %= 1000000007L;
			sumJ -= a[i + 1];
		}
		System.out.println(ans);
	}
}
