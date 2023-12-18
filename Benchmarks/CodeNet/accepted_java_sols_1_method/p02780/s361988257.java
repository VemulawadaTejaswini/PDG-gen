import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] p = new int[(int) (N)];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}

		double a = 0;
		for (int i = 0; i < K; i++) {
			a += p[i] + 1;
		}
		double answer = a;

		for (int i = K; i < N; i++) {
			a -= p[i - K] + 1;
			a += p[i] + 1;
			answer = Math.max(a, answer);
		}

		System.out.println(answer / 2.0);
	}
}
