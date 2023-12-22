import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long H = sc.nextLong();
			int cnt = 0;
			for (;;) {
				if (H == 1) {
					break;
				}
				H = H / 2;
				cnt++;
			}
			long ans = 1;
			for (int i = 0; i < cnt; i++) {
				ans = 2 * ans + 1;
			}
			System.out.print(ans);
		}
	}
}
