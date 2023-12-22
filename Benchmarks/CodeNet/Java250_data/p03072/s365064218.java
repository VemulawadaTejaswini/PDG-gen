import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int ans = 1;
		outer:
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (h[j] > h[i]) {
					continue outer;
				}
			}
			ans++;
		}

		System.out.println(ans);
		sc.close();
	}
}
