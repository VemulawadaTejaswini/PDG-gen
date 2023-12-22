import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A + 1];
		int[] b = new int[B + 1];

		int minA = 1000000;
		int minB = 1000000;

		for (int i = 1; i <= A; i++) {
			a[i] = sc.nextInt();
			minA = minA < a[i] ? minA : a[i];
		}
		for (int i = 1; i <= B; i++) {
			b[i] = sc.nextInt();
			minB = minB < b[i] ? minB : b[i];
		}

		int min = minA + minB;

		for (int i = 1; i <= M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int p = a[x] + b[y] - c;
			min = min < p ? min : p;
		}
		System.out.println(min);
	}
}