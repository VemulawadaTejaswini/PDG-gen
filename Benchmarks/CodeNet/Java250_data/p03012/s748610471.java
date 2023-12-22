import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] w = new int[n];
		for (int i = 0; i < w.length; i++) {
			w[i] = Integer.parseInt(sc.next());
		}
		int ans = 100;
		for (int i = 0; i < n; i++) {
			int less = 0;
			int more = 0;
			for (int j = 0; j < w.length; j++) {
				if (j <= i) {
					less += w[j];
				} else {
					more += w[j];
				}
			}
			ans = Math.min(ans, Math.abs(more - less));
		}
		System.out.println(ans);
		sc.close();
	}
}