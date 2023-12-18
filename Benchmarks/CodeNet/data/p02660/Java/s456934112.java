import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		int R = (int)Math.sqrt(N);
		int ans = 0;
		int f = 0;

		if(N == 1) {

			System.out.println(0);

		} else {

			for (long i = 2; i <= R; i++) {

				if(N % i == 0) {
					N /= i;
					ans++;
					f++;
				}
			}

			if(f == 0) {
				ans++;
			}

			System.out.println(ans);
		}
	}
}