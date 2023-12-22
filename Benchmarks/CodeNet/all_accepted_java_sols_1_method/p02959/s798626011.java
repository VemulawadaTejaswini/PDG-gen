import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];
		for(int i = 0 ; i < n + 1 ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			b[i] = sc.nextInt();
		}

		long ans = 0;


		for (int i = 0; i < n; i++) {

			if (a[i] >= b[i]) {
				ans += b[i];
			} else {

				if (a[i] < b[i]) {

					int zan = b[i] - a[i];

					ans += a[i];

					if (a[i+1] >= zan) {
						ans += zan;
						a[i+1] = a[i+1] - zan;
					// 2番目の街までしか倒せない
					} else if(a[i+1] < zan) {
						ans += a[i+1];
						a[i+1] = 0;
					}
				}
			}
		}

		System.out.println(ans);

	}
}
