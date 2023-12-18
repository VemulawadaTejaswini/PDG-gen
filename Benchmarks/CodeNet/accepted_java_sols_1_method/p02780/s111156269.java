import java.util.Scanner;

//AtCoder Beginner Contest 154
//D	Dice in Line
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int maxSum4 = 0;
		int sum4 = 0;
		for (int i = 0; i < N; i++) {
			if (i < K) {
				sum4 += p[i];
				maxSum4 = sum4;
			} else {
				sum4 += p[i];
				sum4 -= p[i-K];
				maxSum4 = Math.max(sum4, maxSum4);
			}
		}
		double ans = (maxSum4 + K) / 2.0d;
		System.out.println(ans);
	}
}
