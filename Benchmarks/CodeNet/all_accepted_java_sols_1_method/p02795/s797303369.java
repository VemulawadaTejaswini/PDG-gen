import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int ans =0;
		int div;
		div = H >= W ? H : W;
		ans += N / div;
		if (N % div > 0) {
			ans++;
		}
		System.out.println(ans);
	}
}