import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		long n = Long.parseLong(temp[0]);
		long a = Long.parseLong(temp[1]);
		long b = Long.parseLong(temp[2]);

		double cnt = Math.floor(n / (double)(a + b));
		long ans = (long)cnt * b;


		long diff = n - (long)cnt * (a + b);

		ans += diff > a ? diff - a : 0;

		System.out.println(n - ans);


	}
}