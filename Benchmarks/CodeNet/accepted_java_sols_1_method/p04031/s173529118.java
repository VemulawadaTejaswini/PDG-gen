import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if (N < 2) {
			System.out.println(0);
			in.close();
			return;
		}
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int ans = Integer.MAX_VALUE;
		for (int i = a[0]; i <= a[a.length - 1]; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				count += (a[j] - i) * (a[j] - i);
			}
			ans = Math.min(ans, count);
		}
		System.out.println(ans);
		in.close();
	}
}