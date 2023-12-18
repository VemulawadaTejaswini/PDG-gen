import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int R = sc.nextInt();
			int ans = 0;
			while (true) {
				if (N < 1) {
					break;
				}
				N /= R;
				ans++;
			}
			System.out.print(ans);
		}
	}
}