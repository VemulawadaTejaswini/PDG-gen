import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
		int[] balls = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();

		int a_let = 0;
		int b_let = 0;
		int ans = 0;

		for (int i = 0; i < items; i++) {
			a_let = Math.abs(0 - balls[i]) * 2;
			b_let = Math.abs(k - balls[i]) * 2;

			if (a_let <= b_let) {
				ans +=a_let;
			} else {
				ans +=b_let;
			}
		}

		System.out.println(ans);
	}

}
