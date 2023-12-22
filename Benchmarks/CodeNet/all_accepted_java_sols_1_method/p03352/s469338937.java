import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		int ans = 1;
		for (int i = 2; i * i <= x; i++) {
			int b = i;
			while (b <= x) {
				b *= i;
			}
			b /= i;
			ans = Math.max(ans, b);
		}
		System.out.println(ans);
	}
}
