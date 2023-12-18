import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w, n;
		w = sc.nextInt();
		n = sc.nextInt();

		int[] ans;
		ans = new int[w + 1];

		for (int i = 0; i <= w; i++) {
			ans[i] = i;
		}

		for (int i = 0; i < n; i++) {
			int a, b;
			String[] s = sc.next().split(",");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			int noise;
			noise = ans[a];
			ans[a] = ans[b];
			ans[b] = noise;
		}

		for (int i = 1; i <= w; i++) {
			System.out.println(ans[i]);
		}

	}
}
