import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long x = a * b * c;
		long y = Math.max(Math.max(a * b * (c / 2), a * (b / 2) * c), (a / 2) * b * c);
		long z = x - y;
		System.out.println(Math.abs(y - z));
	}
}
