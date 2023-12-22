import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = in.nextInt();
		}
		int ans = 0;
		while (true) {
			int left = -1;
			for (int i = 0; i < N; i++) {
				if (h[i] != 0) {
					left = i;
					break;
				}
			}
			if (left == -1) {
				break;
			}
			int right = left;
			while (right + 1 < N && h[right] <= h[right + 1]) {
				right++;
			}
			for (int j = left; j <= right; j++) {
				h[j] -= 1;
			}
			ans += 1;
		}
		System.out.println(ans);
		in.close();
	}
}