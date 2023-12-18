import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t0 = 0;
		int x0 = 0;
		int y0 = 0;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int d = Math.abs(x - x0) + Math.abs(y - y0);
			int dt = t - t0;
			if (d > dt || (dt - d) % 2 != 0) {
				flag = false;
				break;
			}
			t0 = t;
			x0 = x;
			y0 = y;
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
