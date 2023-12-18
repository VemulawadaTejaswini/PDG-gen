import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				int kk = n - i * R - j * G;
				if (kk % B == 0 && kk >=0) {
					int k = (n - i * R - j * G) / B;
						ans++;
//						System.out.println("i:" + i + " j:" + j + " b:" + k);
					}
				}
			}

		System.out.println(ans);
	}
}
