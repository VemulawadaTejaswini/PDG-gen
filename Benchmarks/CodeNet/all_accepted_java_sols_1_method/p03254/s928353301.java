import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (x <= 0) break;
			x -= a[i];
			ans++;
		}

		if (x == 0) {
			System.out.println(ans);
		} else {
			System.out.println(ans - 1);
		}

		sc.close();
	}

}
