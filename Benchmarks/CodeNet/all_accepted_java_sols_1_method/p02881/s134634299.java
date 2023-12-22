import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		int n2 = (int) Math.sqrt(n);
		for (int a = n2; a > 0; a--) {
			if (n % a == 0) {
				System.out.println(a - 1 + n/a - 1);
				return;
			}
		}
	}
}
