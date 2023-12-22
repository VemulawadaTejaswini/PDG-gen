import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt() - (i + 1);
		}

		Arrays.sort(a);
		int b = a[n / 2];

		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - b);
		}

		System.out.println(ans);
    }
}
