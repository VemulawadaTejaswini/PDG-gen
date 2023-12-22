import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int cnt = 0;
		int max = 0;
		for (int i = n - 1; i >= 1; i--) {
			if (h[i] <= h[i - 1]) {
				cnt++;
				max = Math.max(max, cnt);
			} else {
				cnt = 0;
			}
		}
		System.out.println(max);
	}
}
