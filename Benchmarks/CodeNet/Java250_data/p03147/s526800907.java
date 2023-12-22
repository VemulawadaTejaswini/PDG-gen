import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int h[] = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int cnt = 0;
		int idx = 0;
		int endidx = 0;
		boolean b;
		while (true) {
			idx = 0;
			b = false;
			for (; idx < n; idx++) {
				if (h[idx] > 0) {
					break;
				}
			}
			endidx = idx;
			for (; endidx < n; endidx++) {
				if (h[endidx] <= 0) {
					break;
				}
			}
			for (; idx < endidx; idx++) {
				h[idx]--;
				b = true;
			}
			if (b) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}
