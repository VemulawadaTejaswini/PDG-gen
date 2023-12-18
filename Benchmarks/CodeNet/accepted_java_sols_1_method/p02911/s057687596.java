import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int Q = sc.nextInt();
			int[] points = new int[N];
			for (int i = 0; i < Q; i++) {
				int pointGetter = sc.nextInt() - 1;
				points[pointGetter]++;
			}
			for (int i = 0; i < N; i++) {
				if (K - Q + points[i] > 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
