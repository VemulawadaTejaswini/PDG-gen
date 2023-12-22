import java.util.Scanner;

//日立製作所 社会システム事業部 プログラミングコンテスト2020
//B - Nice Shopping
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] a = new int[A];
		for (int i = 0; i < A; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int[] b = new int[B];
		for (int i = 0; i < B; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		int[] x = new int[M];
		int[] y = new int[M];
		int[] c = new int[M];
		for (int i = 0; i < M; i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
			c[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int minA = 100000;
		for (int i = 0; i < A; i++) {
			minA = Math.min(a[i], minA);
		}
		int minB = 100000;
		for (int i = 0; i < B; i++) {
			minB = Math.min(b[i], minB);
		}
		int ans = minA + minB;
		for (int i = 0; i < M; i++) {
			ans = Math.min(ans, a[x[i]-1] + b[y[i]-1] - c[i]);
		}

		System.out.print(ans);
	}

}
