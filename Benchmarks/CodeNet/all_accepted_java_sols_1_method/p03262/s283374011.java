import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] d = new int[N+1];
		d[0] = X;
		for (int i = 1; i < N+1; i++) {
			int xi = sc.nextInt();
			d[i] = xi;
		}
		Arrays.sort(d);
		int dmin = Integer.MAX_VALUE;
		for (int i = 1; i < d.length; i++) {
			int dir = d[i] - d[i-1];
			if (dir != 0) {
				dmin = Math.min(dir, dmin);
			}
		}
		int index = 2;
		int dmins = dmin;
		while (true) {
			boolean key = true;
			for (int i = 0; i < d.length; i++) {
				int dir = Math.abs(X-d[i]);
				if (dir%dmin != 0) {
					while (true) {
						if (dmins%index == 0) {
							dmin = dmins/index;
							index++;
							break;
						} else {
							index++;
						}
					}
					key = false;
					break;
				}
			}
			if (key) {
				break;
			}
		}
		System.out.println(dmin);
	}
}
