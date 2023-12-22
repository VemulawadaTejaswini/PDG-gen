import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int max = 0;
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			if (h[i] >= h[i + 1]) {
				cnt++;
			} else {
				cnt = 0;
			}
			if (max < cnt) {
				max = cnt;
			}
		}
		System.out.println(max);
	}
}
