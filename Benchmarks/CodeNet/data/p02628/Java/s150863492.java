import java.util.Arrays;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] p = new int[N];
		int ans = 0;

		for(int i = 0;i < N;i++) {
			p[i] = scan.nextInt();
		}

		Arrays.sort(p);

		for(int i = 0;i < K;i++) {
			ans += p[i];
		}

		System.out.println(ans);

	}
}