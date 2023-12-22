import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int max = 0;
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			int x = i;
			int a = 0;
			while (x % 2 == 0) {
				x /= 2;
				a++;
			}
			if (max < a) {
				max = a;
				ans = i;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
