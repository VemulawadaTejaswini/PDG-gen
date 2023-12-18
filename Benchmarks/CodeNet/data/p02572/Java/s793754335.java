import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n      = Integer.parseInt(sc.nextLine());
		String[] s = sc.nextLine().split(" ");
		long[] lst = new long[n];
		long mod   = 1000000007;
		long ans   = 0;

		for(int i = 0; i < n; i ++) {

			lst[i] = Long.parseLong(s[i]);
		}


		for(int i = 0; i < n - 1; i++) {

			for(int j = i + 1; j < n; j++) {

				ans = (lst[i] * lst[j] + ans) % mod;
			}

		}

		System.out.println(ans);
	}
}
