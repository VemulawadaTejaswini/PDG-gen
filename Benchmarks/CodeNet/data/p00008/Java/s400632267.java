import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		final int max = 10;
		Scanner scn = new Scanner(System.in);
		try {
			while (true) {
				int n = scn.nextInt();
				long ans = 0;
				for (int w = 0; w < max; w++) {
					if (n - w > (max - 1) * 3)
						continue;
					if (n - w < 0)
						break;
					for (int x = w; x < max; x++) {
						if (n - w - x > (max - 1) * 2)
							continue;
						if (n - w - x < 0)
							break;
						for (int y = x; y < max; y++) {
							if (n - w - x - y > (max - 1))
								continue;
							if (n - w - x - y < y)
								break;
							int z = n - w - x - y;
							if (w == x && x == y && y == z) {
								ans += 1;
							} else {
								if ((w == x && x == y) || (x == y && y == z)) {
									ans += 4;
								} else {
									if (w == x && y == z) {
										ans += 6;
									} else {
										if ((w == x) || (x == y) || (y == z)) {
											ans += 12;
										} else {
											ans += 24;
										}
									}
								}
							}
						}
					}
				}
				System.out.println(ans);
			}
		} catch (Exception e) {

}
	}

}