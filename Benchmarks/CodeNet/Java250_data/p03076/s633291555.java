import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] menu = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		sc.close();

		int ans = 0;

		int min = 10;
		int minIdx = 0;
		for (int i = 0; i < 5; i++) {
			int digit = menu[i] % 10;
			if (digit != 0 && digit < min) {
				min = digit;
				minIdx = i;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (i != minIdx) {
				ans += menu[i];
				if (ans % 10 != 0) {
					ans = (int) Math.ceil(ans / 10.0) * 10;
				}
			}
		}

		ans += menu[minIdx];
		System.out.println(ans);
	}
}
