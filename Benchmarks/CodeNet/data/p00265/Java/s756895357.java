import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a  = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int max = a[a.length - 1] + 2;
		int[] t = new int[max];
		for (int i = 0; i < n; i++) {
			t[a[i] + 1] = 1;
		}
		t[0] = -1;
		for (int i = 1; i < max; i++) {
			if (t[i] == 1) {
				t[i] = i - 1;
			} else {
				t[i] = t[i - 1];
			}
		}

//		System.out.println("query start");
		for (int i = 0; i < q; i++) {
			int p = sc.nextInt();
//			System.out.println(p);
			int opt = 0;
			int idx = t[max - 1];
			while (0 <= idx) {
				int mod = idx % p;
				opt = Math.max(opt, mod);
				idx -= mod;
				idx = t[idx];
			}
			System.out.println(opt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}