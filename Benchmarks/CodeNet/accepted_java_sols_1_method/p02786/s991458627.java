import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		sc.close();

		long ans = 0;
		long num = 1;
		while (h > 0) {
			ans += num;
			h /= 2;
			num *= 2;
		}
		System.out.println(ans);
	}
}
