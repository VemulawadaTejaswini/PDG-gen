import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(long a=1;a<=3500;a++) {
			for(long b=1;b<=3500;b++) {
				long c1 = a * b * n;
				long c2 = 4 * a * b - n * b - n * a;
				if (c2 == 0) continue;
				if (c1 % c2 != 0) continue;
				long c = c1 / c2;
				if (c > 0) {
					System.out.println(a + " " + b + " " + c);
					return;
				}
			}
		}
	}
}
