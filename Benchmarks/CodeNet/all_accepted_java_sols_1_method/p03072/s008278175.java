import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int before = 0;
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int H = scan.nextInt();

			if (before <= H) {
				cnt++;
			}
			if (H > before) {
				before = H;
			}
		}

		System.out.println(cnt);
	}
}