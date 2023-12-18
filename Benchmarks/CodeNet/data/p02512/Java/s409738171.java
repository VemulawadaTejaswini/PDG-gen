import java.util.*;

class B implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int n = sc.nextInt(); n > 0; n = sc.nextInt()) {
			int m = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int id = 0;
			int w = m / a[0] * a[0];
			boolean hope = false;
			for (int i = 1; i < n; i++) {
				int ww = (w + a[i] - 1) / a[i] * a[i];
				if (ww > m || (ww == w && ww + a[i] > m && a[i] < a[id])) {
					id = i;
					w = m / a[i] * a[i];
					hope = false;
				} else if (ww == w && a[i] == a[id]) {
					hope = true;
				}
			}
			System.out.println(hope ? n : id + 1);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		new B().run();
	}
}