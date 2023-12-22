import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			int K = Integer.parseInt(sc.next());
			long[] a = new long[N];
			for (int i = 0; i < N; i++) {
				a[i] = Long.parseLong(sc.next());
			}
			for (int i = K + 1; i <= N; i++) {
				if (a[i - 1] > a[i - 1 - K]) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}