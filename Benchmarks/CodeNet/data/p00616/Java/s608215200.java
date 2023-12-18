import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			int H = sc.nextInt();
			if (N == 0 && H == 0) break;
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < H; ++i) {
				String surface = sc.next();
				int v1 = sc.nextInt() - 1;
				int v2 = sc.nextInt() - 1;
				if (surface.equals("xy")) {
					for (int j = 0; j < N; ++j) {
						set.add((v1 << 18) + (v2 << 9) + j);
					}
				} else if (surface.equals("yz")) {
					for (int j = 0; j < N; ++j) {
						set.add((j << 18) + (v1 << 9) + v2);
					}
				} else {
					for (int j = 0; j < N; ++j) {
						set.add((v1 << 18) + (j << 9) + v2);
					}
				}
			}
			System.out.println(N * N * N - set.size());
		}
	}

}