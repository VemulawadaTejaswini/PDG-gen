import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int e = sc.nextInt();
			if (e == 0) break;
			int m = 1 << 30;
			for (int z = 0;; ++z) {
				int yx = e - z * z * z;
				if (yx < 0) break;
				for (int y = 0; y * y <= yx; ++y) {
					int x = yx - y * y;
					m = Math.min(m, x + y + z);
				}
			}
			System.out.println(m);
		}
	}

}