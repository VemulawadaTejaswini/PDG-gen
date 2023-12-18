import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long p[] = new long[a];
		long q[] = new long[b];
		long r[] = new long[c];

		for (int i = 0; i < a; i++) {
			p[i] = sc.nextLong();
		}

		for (int i = 0; i < b; i++) {
			q[i] = sc.nextLong();
		}

		for (int i = 0; i < c; i++) {
			r[i] = sc.nextLong();
		}

		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);

		long newP[] = new long[a];
		long newQ[] = new long[b];

		for (int i = a - 1; a - x <= i; i--) {
			newP[a - i - 1] = p[i];
		}

		for (int i = b - 1; b - y <= i; i--) {
			newQ[b - i - 1] = q[i];
		}

		long[] hoge = new long[x + y + c];

		System.arraycopy(newP, 0, hoge, 0, x);
		System.arraycopy(newQ, 0, hoge, x, y);
		System.arraycopy(r, 0, hoge, x + y, r.length);

		long answer = 0;
		Arrays.sort(hoge);

		for (int i = 0; i < x + y; i++) {
			answer += hoge[x + y + c - i - 1];
		}

		System.out.println(answer);
		sc.close();

	}
}