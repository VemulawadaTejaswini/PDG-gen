import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int res = Integer.MAX_VALUE;
		int N = scan.nextInt();
		int as[] = new int[N + 1];
		as[0] = 0;

		for(int i = 1; i <= N; i++) {
			as[i] = as[i - 1] + scan.nextInt();
		}

		for(int i = 1; i < N; i++) {
			res = Math.min(res, Math.abs(2 * as[i] - as[N]));
		}

		System.out.println(res);
	}
}