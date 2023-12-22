import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int xx = 0, yy = 0, tt = 0, t, x, y;
		boolean b = true;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			if (t - tt - Math.abs(x - xx) - Math.abs(y - yy) >= 0
					&& (t - tt- Math.abs(x - xx) - Math.abs(y - yy)) % 2 == 0) {
				tt = t;
				xx = x;
				yy = y;
			} else {
				b = false;
				break;
			}
		}
		if (b) {
			sb.append("Yes");
		} else {
			sb.append("No");
		}
		System.out.println(sb);
	}
}