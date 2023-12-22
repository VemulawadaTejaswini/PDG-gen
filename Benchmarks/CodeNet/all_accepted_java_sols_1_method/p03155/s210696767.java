import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();

		int cnt = 0;

		for (int i = W; i <= N; i++) {
			for (int j = H; j <= N; j++) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
