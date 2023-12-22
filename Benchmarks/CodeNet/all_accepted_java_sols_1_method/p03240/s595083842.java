import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] vx = new long[n];
		long[] vy = new long[n];
		long[] vh = new long[n];
		int si = -1;
		for (int i = 0; i < n; i++) {
			vx[i] = in.nextLong();
			vy[i] = in.nextLong();
			vh[i] = in.nextLong();
			if (vh[i] > 0) {
				si = i;
			}
		}
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				long h = vh[si] + Math.abs(x - vx[si]) + Math.abs(y - vy[si]);
				boolean isOk = true;
				for (int i = 0; i < n; i++) {
					if (vh[i] > 0 && h - vh[i] != Math.abs(x - vx[i]) + Math.abs(y - vy[i])) {
						isOk = false;
					}
					if (vh[i] == 0 && h > Math.abs(x - vx[i]) + Math.abs(y - vy[i])) {
						isOk = false;
					}
				}
				if (isOk) {
					System.out.println(x);
					System.out.println(y);
					System.out.println(h);
					in.close();
					return;
				}
			}
		}
	}
}