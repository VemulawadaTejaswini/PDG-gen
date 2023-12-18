import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[A];
		int[] b = new int[B];
		for ( int i = 0 ; i < A ; i++ ) {
			a[i] = sc.nextInt();
		}
		for ( int i = 0 ; i < B ; i++ ) {
			b[i] = sc.nextInt();
		}
		int[] x = new int[M];
		int[] y = new int[M];
		int[] c = new int[M];
		for ( int i = 0 ; i < M ; i++ ) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();

		int minA = Integer.MAX_VALUE;
		for ( int i = 0 ; i < A ; i++ ) {
			minA = Math.min(minA, a[i]);
		}
		int minB = Integer.MAX_VALUE;
		for ( int i = 0 ; i < B ; i++ ) {
			minB = Math.min(minB, b[i]);
		}
		int minPrice = minA + minB;

		for ( int i = 0 ; i < M ; i++ ) {
			minPrice = Math.min(minPrice, a[x[i] - 1] + b[y[i] - 1] - c[i]);
		}
		System.out.println(minPrice);
	}
}
