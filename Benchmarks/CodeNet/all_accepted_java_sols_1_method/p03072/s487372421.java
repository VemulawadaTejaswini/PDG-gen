import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] h = new int[n];
		int cnt = 0;
		int sum = 1;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (h[i] >= h[j]) {
					cnt++;
				}
			}
			if (cnt == i) {
				sum++;
			}
			cnt = 0;
		}
		System.out.println(sum);
		sc.close();
	}
}