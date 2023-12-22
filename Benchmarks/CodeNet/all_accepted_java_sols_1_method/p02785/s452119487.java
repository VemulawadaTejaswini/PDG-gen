import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long con =0;

		long[] monsters = new long[N];

		for (int i = 0; i < N; i++) {
			monsters[i] += sc.nextLong();
		}

		Arrays.sort(monsters);

		for (int i = 0; i < N - K; i++) {
			con += monsters[i];
		}

		System.out.println(con);

	}
}