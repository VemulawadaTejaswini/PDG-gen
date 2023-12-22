import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int m = sc.nextInt();
		double ans = 0, ms = 1900;
		
		ans = ((n - m) * 100 + ms * m) * Math.pow(2, m);
		
		System.out.println(String.format("%.0f", ans));

		sc.close();
	}
}
