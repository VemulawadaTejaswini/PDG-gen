import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < w.length; i++) {
			int s1 = 0;
			int s2 = 0;
			for (int j = 0; j < w.length; j++) {
				if (j <= i) {
					s1 += w[j];
				} else {
					s2 += w[j];
				}
			}
			ans = Math.min(ans, Math.abs(s1 - s2));
		}
		System.out.println(ans);
	}
}
