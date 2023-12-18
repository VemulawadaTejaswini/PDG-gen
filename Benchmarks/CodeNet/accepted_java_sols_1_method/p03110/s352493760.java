import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		double btc = 380000.0;
		double x, sum = 0;
		String str;
		for (int i = 0; i < n; i++) {
			x = sc.nextDouble();
			str = sc.next();
			if (str.equals("JPY")) {
				sum += x;
			} else if (str.equals("BTC")) {
				sum += x * btc;
			}
		}
		System.out.println(sum);
	}
}
