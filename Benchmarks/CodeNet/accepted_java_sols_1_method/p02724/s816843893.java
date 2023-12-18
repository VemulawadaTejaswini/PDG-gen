import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();
		long ans = 0;

		ans += (num / 500) * 1000;
		num = num % 500;

		ans += (num / 5) * 5;
		num = num % 5;

		System.out.println(ans);

	}
}