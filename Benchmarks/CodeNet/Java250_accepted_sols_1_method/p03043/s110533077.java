import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		double ans = 0;
		for (int i = 1; i <= N; i++) {
			double tmp = 1.0 / N;
			int now = i;
			while (now < K) {
				now *= 2;
				tmp /= 2;
			}
			ans += tmp;
		}
		System.out.println(String.format("%.12f", ans));
		in.close();
	}
}