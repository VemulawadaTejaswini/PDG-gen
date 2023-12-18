import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int W = sc.nextInt();
			int Q = sc.nextInt();
			if (W == 0 && Q == 0) break;
			int[] wall = new int[W];
			Arrays.fill(wall, -1);
			for (int i = 0; i < Q; ++i) {
				String q = sc.next();
				int id = sc.nextInt();
				if (q.equals("s")) {
					int width = sc.nextInt();
					int pos = -1;
					for (int j = 0; j <= W - width; ++j) {
						boolean ok = true;
						for (int k = 0; k < width; ++k) {
							if (wall[j + k] != -1) {
								ok = false;
								break;
							}
						}
						if (ok) {
							pos = j;
							for (int k = 0; k < width; ++k) {
								wall[j + k] = id;
							}
							break;
						}
					}
					System.out.println(pos == -1 ? "impossible" : pos);
				} else {
					for (int j = 0; j < W; ++j) {
						if (wall[j] == id) wall[j] = -1;
					}
				}
			}
			System.out.println("END");
		}
	}

}