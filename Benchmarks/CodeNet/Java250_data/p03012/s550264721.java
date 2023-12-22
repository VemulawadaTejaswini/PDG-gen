import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] w = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			w[i] = Integer.parseInt(sc.next());
			sum += w[i];
		}
		sc.close();

		int s1 = w[0];
		int s2 = sum - w[0];
		int ans = Math.abs(s2 - s1);
		for (int i = 1; i < N - 1; i++) {
			s1 += w[i];
			s2 -= w[i];
			ans = Math.min(ans, Math.abs(s2 - s1));
		}
		System.out.println(ans);

	}

}
