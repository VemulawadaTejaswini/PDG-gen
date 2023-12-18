import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < h.length; i++) {
			if (h[i] >= k) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
