import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong();
		long ans = 0L;
		long nextT = 0L;
		for (int i = 0; i < N; i++) {
			long t = sc.nextLong();
			if (t < nextT) {
				ans += t + T - nextT;
			} else {
				ans += T;
			}
			nextT = t + T;
		}
		sc.close();

		System.out.println(ans);
	}
}
