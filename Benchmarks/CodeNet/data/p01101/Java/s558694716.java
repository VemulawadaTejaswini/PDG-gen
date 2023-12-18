import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0 && s == 0) return;
			int p[] = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			int ans = 0;

			for (int i = 0; i < n-1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (p[i] + p[j] <= s)
						ans = Math.max(ans,  p[i] + p[j]);
				}
			}
			if (ans == 0)
				System.out.println("NONE");
			else
				System.out.println(ans);
		}
	}
}
