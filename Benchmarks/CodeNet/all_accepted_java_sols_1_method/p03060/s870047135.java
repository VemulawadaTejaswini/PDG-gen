import java.util.*;

class Main {
	static int n;
	static int[] v;
	static int[] c;
	static int x;
	static int y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		v = new int[n];
		c = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (v[i] > c[i]) {
				x += v[i];
				y += c[i];
			}
		}
		System.out.println(x - y);
	}
}