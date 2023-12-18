import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		if(n == 0) {
			System.out.println(x);
			return;
		}

		int p [] = new int [n];

		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}


		int ans = x;
		for(int i = 0; i < 101; i++) {
			boolean t = true;
			for(int j = 0; j < n; j++) {
				if(p[j] == ans) {
					t = false;
				}
			}
			if(t) {
				System.out.println(ans);
				return;
			}

			if(i % 2 == 0) {
				ans -= (i + 1);

			}else {
				ans += (i + 1);
			}
		}
	}
}