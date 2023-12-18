import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	int n, q;
	int dat[];

	void init() {
		dat = new int[n * 2 - 1];
		for (int i = 0; i < n * 2 - 1; i++) {
			dat[i] = Integer.MAX_VALUE;
		}
	}

	int query(int a, int b, int k, int l, int r) {
		if (a <= l && r <= b) return dat[k];
		if (r <= a || b <= l) return Integer.MAX_VALUE;
		int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
		int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
		return Math.min(vl, vr);
	}

	void update(int i, int x) {
		i += n - 1;
		dat[i] = x;
		while (i > 0) {
			i = (i - 1) / 2;
			dat[i] = Math.min(dat[i * 2 + 1], dat[i * 2 + 2]);
		}
	}

	void run() {
		int nn = sc.nextInt();
		n = 1;
		while (n < nn) n *= 2;
		q = sc.nextInt();

		init();
		while (q-- > 0) {
			int com = sc.nextInt();
			if (com == 0) {
				int i = sc.nextInt();
				int x = sc.nextInt();
				update(i, x);
			} else {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(query(x, y + 1, 0, 0, n));
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}