
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 0;
		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(sc.next());
		}

		int ans = 1;
		if (n > k) {
			ans += (n - k) / (k - 1);
			if ((n - k) % (k - 1) != 0)
				ans++;
		}

		System.out.println(ans);

	}

}
