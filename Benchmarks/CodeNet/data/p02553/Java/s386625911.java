import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] t = sc.nextLine().split(" ");
		long a = Long.parseLong(t[0]);
		long b = Long.parseLong(t[1]);
		long c = Long.parseLong(t[2]);
		long d = Long.parseLong(t[3]);

		long ans = a * c;
		ans = Math.max(ans, a * d);
		ans = Math.max(ans, b * d);
		ans = Math.max(ans, b * c);

		if((a <= 0 && b >= 0 )|| (c <= 0 && d >= 0)) {
			ans = Math.max(ans, 0);
		}


		System.out.println(ans);
	}
}