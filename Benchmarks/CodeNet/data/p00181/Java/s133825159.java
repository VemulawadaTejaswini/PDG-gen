import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if ((m | n) == 0) {
				return;
			}
			int book[] = new int[n];
			int right = 1500000;
			int left = 1;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				book[i] = sc.nextInt();
				left = Math.max(left, book[i]);
			}
			int width = 0;
			int step = 1;
			while (right - left > 1) {
				int mid = (right + left) / 2;
				width = 0;
				step = 1;
				for (int i = 0; i < n; i++) {
					if (width + book[i] <= mid) {
						width += book[i];
					} else {
						width = book[i];
						step++;
					}
				}
				if (step <= m) {
					min = Math.min(min, mid);
					right = mid;
				} else {
					left = mid;
				}
			}
			width = 0;
			step = 1;
			for (int i = 0; i < n; i++) {
				if (width + book[i] <= left) {
					width += book[i];
				} else {
					width = book[i];
					step++;
				}
			}
			if (step <= m) {
				min = Math.min(min, left);
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}