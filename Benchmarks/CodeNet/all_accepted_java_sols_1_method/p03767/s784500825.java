import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt() * 3;
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		long ans = 0;
		for (int i = N - 2; i >= N / 3; i -= 2) {
			ans += a[i];
		}
		System.out.println(ans);
		in.close();
	}
}