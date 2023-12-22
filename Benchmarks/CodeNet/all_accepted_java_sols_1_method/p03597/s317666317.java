import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int A = sc.nextInt();
		double ans = 0;
		
		ans = Math.pow(N, 2) - A;
		
		System.out.println(String.format("%.0f", ans));

		sc.close();
	}
}
