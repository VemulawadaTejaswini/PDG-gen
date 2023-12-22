import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int aMin = 100000;
		for(int i = 0; i < A; i++) {
			a[i] = sc.nextInt();
			aMin = Math.min(aMin, a[i]);
		}
		int[] b = new int[B];
		int bMin = 100000;
		for(int i = 0; i < B; i++) {
			b[i] = sc.nextInt();
			bMin = Math.min(bMin, b[i]);
		}

		int waribikigo = 1000000;
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();

			int tmp = a[x-1] + b[y-1] - c;
			waribikigo = Math.min(waribikigo, tmp);
		}
		System.out.println(Math.min(waribikigo, aMin+bMin));
	}
}