import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int loc_x = 0;
		int loc_y = 0;
		int loc_t = 0;
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int dis = Math.abs(loc_x-x) + Math.abs(loc_y-y);
			
			if(dis - (t - loc_t) > 0 || ((t - loc_t) - dis) % 2 != 0) {
				System.out.println("No");
				return;
			}
			loc_x = x;
			loc_y = y;
			loc_t = t;
		}
		System.out.println("Yes");
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}