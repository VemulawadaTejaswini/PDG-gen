import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int ans = 0;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				int tmp = N - R * i - G * j;
				if (tmp >= 0 && tmp % B == 0) ans++;
			}
		}

		System.out.println(ans);
	}

}