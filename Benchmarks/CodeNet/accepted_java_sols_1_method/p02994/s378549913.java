import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.close();
		int max = N + L - 1;
		int ans;
		if (max < 0) {
			ans = (L + max - 1) * (N - 1) / 2;
		} else if (L > 0) {
			ans = (L + max + 1) * (N - 1) / 2;
		} else {
			ans = (L + max) * N / 2;
		}
		System.out.println(ans);
	}
}