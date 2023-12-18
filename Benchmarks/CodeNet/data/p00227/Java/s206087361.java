import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if ((n | m) == 0) {
				break;
			}

			int y[] = new int[n];
			for (int i = 0; i < n; i++) {
				y[i] = sc.nextInt();
			}
			Arrays.sort(y);

			int ans = 0;
			for (int i = 0; i < n; i++) {
				if ((i + 1) % m != 0) {
					ans += y[y.length - 1 - i];
				}
			}
			System.out.println(ans);
			
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}