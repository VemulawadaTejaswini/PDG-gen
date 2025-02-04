
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			boolean[] color = new boolean[8];
			for (boolean b : color) {
				b = false;
			}

			int highRate = 0;

			for (int i = 0; i < N; i++) {
				int tmp = sc.nextInt();
				if (tmp < 400) {
					color[0] = true;
				} else if (tmp < 800) {
					color[1] = true;
				} else if (tmp < 1200) {
					color[2] = true;
				} else if (tmp < 1600) {
					color[3] = true;
				} else if (tmp < 2000) {
					color[4] = true;
				} else if (tmp < 2400) {
					color[5] = true;
				} else if (tmp < 2800) {
					color[6] = true;
				} else if (tmp < 3200) {
					color[7] = true;
				} else {
					highRate++;
				}
			}

			int min = 0;
			for (boolean b : color) {
				if (b) {
					min++;
				}
			}
			int max = min + highRate;
			if (min < 1) min = 1;
			System.out.println(min + " " + max);
		}
	}
}