import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long d = (long)Math.pow(2, 31) - 1;
	static long[]node;
	static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		N = 1;
		while(N < n) {
			N = N * 2;
		}
		node = new long[2 * N - 1];
		Arrays.fill(node, d);

		for(int i = 0; i < q; i++) {
			int com = scan.nextInt();
			if(com == 0) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				update(x, y);
			}else {
				int x = scan.nextInt();
				int y = scan.nextInt();
				long k = getMin(x, y + 1, 0, 0, N);
				System.out.println(k);
			}
		}
		scan.close();
	}
	static void update(int k, int a) {
		k += N - 1;
		node[k] = a;
		while(k > 0) {
			k = (k - 1) / 2;
			node[k] = Math.min(node[2 * k + 1], node[2 * k + 2]);
		}
	}
	static long getMin(int a, int b, int k, int l, int r) {
		if(r <= a || b <= l) {
			return d;
		}
		if(a <= l && r <= b) {
			return node[k];
		}else {
			long vl = getMin(a, b, 2 * k + 1, l, (l + r) / 2);
			long vr = getMin(a, b, 2 * k + 2, (l + r) / 2, r);
			return Math.min(vl, vr);
		}
	}
}
