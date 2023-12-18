
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[] arrX = new int[n];
			int[] arrY = new int[m];
			for (int i = 0; i < n; i++) {
				arrX[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				arrY[i] = sc.nextInt();
			}

			Arrays.sort(arrX);
			Arrays.sort(arrY);

			boolean flg;
			for (int z = x + 1; z <= y; z++) {
				flg = true;
				for (int xi : arrX) {
					if (z <= xi) {
						flg = false;
						break;
					}
				}
				for (int yi : arrY) {
					if (yi < z) {
						flg = false;
						break;
					}
				}
				if (flg) {
					System.out.println("No War");
					return;
				}
			}

			System.out.println("War");
		}
	}
}
