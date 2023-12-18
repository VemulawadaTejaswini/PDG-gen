import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		sc.close();

		long ans = x / 500 * 1000;
		x %= 500;
		ans += x / 5 * 5;
		System.out.println(ans);
	}
}
