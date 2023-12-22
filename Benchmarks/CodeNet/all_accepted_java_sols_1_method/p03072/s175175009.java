import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		int ans = 1;
		for (int i = h.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (h[i] < h[j]) {
					break;
				} else if (j == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}