import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();

			int ret = 0;
			int index = 1;
			for (int i = 0; i < N; i++) {
				int tmp = scn.nextInt();
				if (tmp == index) {
					index++;
				} else {
					ret++;
				}
			}
			if (index == 1) {
				System.out.println(-1);
			} else {
				System.out.println(ret);
			}
		}
	}
}
