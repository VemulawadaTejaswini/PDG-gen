import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int h = stdIn.nextInt();
		int w = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
		}
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] >= h) {
				if (b[i] >= w)
					k = k + 1;
			}
		}
		System.out.println(k);
	}
}