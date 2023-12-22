import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] h = new int[n];
		int ans = 1;
		int maxh = sc1.nextInt();

		for ( int i = 1 ; i < n ; i++) {
			h[i] = sc1.nextInt();
			if (h[i] >= maxh) {
				ans++;
				maxh = h[i];
			}
		}

		System.out.println(ans);

		sc1.close();

	}

}