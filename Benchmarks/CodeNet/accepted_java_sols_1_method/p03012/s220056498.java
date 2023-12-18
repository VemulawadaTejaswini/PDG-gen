import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < W.length; i++) {
			int s1 = 0;
			int s2 = 0;
			for (int j = 0; j < i; j++) {
				s1 += W[j];
			}
			for (int z = i; z < W.length; z++) {
				s2 += W[z];
			}
			ans = Math.min(ans, Math.abs(s1 - s2));
		}

		System.out.println(ans);
	}
}
