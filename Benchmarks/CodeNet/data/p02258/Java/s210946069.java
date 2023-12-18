import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int ans = -1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < r.length; j++) {
				ans = Math.max(ans, r[j] - r[i]);
			}
		}
		System.out.println(ans);
	}

}

