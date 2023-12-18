import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long ans = 0;
			for (int i = 1; i < n; i++) {
				ans += (n - 1) / i;
			}
			System.out.println(ans);
		}
	}
}