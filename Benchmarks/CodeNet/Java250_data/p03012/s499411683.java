import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] w = new int[n];

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
		}

		int[] sub = new int[n - 1];
		int idx = 0;
		for (int t = 1; t < w.length; t++) {
			int s1 = 0;
			for (int i = 0; i < t; i++) {
				s1 += w[i];
			}
			int s2 = 0;
			for (int i = t; i < w.length; i++) {
				s2 += w[i];
			}

			sub[idx++] = Math.abs(s1 - s2);
		}

		Arrays.sort(sub);

		System.out.println(sub[0]);
		sc.close();
	}
}
