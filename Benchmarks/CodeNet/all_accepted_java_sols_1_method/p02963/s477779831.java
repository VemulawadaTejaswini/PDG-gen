import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		sc.close();

		long a = (int) Math.ceil(Math.sqrt(s));
		long b = a * a - s;
		if (b == 0) {
			System.out.println("0 0 " + a + " " + 0 + " " + 0 + " " + a);
		} else {
			System.out.println("0 0 " + a + " " + b + " " + 1 + " " + a);
		}
	}
}
