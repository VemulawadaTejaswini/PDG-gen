import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < k; i++) {
			int d = Integer.parseInt(sc.next());
			for (int j = 0; j < d; j++) {
				int snack = Integer.parseInt(sc.next());
				a[snack - 1]++;
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				ans++;
		}
		System.out.println(ans);

	}

}
