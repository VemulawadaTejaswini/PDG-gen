import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double p = 0;

		for (int i = 1; i < N + 1; i++) {
			int cnt = 0;
			int pt = i;
			while (pt <= K - 1) {
				pt *= 2;
				cnt++;
			}

			p += (double) 1 / N * Math.pow(0.5, cnt);
		}

		System.out.println(p);

	}
}
