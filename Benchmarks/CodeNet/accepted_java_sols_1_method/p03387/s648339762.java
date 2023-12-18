import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ABC = { in.nextInt(), in.nextInt(), in.nextInt() };
		Arrays.sort(ABC);
		int ans = 0;
		if ((ABC[0] % 2 == 0 && ABC[1] % 2 == 0) || (ABC[0] % 2 != 0 && ABC[1] % 2 != 0)) {
			int max = Math.max(ABC[0], ABC[1]);
			int min = Math.min(ABC[0], ABC[1]);
			ans += ABC[2] - max;
			ans += (ABC[2] - (ans + min)) / 2;
		} else {
			int even = ABC[0] % 2 == 0 ? ABC[0] : ABC[1];
			int odd = ABC[0] % 2 == 0 ? ABC[1] : ABC[0];
			if (ABC[2] % 2 == 0) {
				ans += (ABC[2] - even) / 2;
				ans += (ABC[2] + 1 - odd) / 2;
				ans++;
			} else {
				ans += (ABC[2] - odd) / 2;
				ans += (ABC[2] + 1 - even) / 2;
				ans++;
			}
		}
		System.out.println(ans);
		in.close();
	}
}