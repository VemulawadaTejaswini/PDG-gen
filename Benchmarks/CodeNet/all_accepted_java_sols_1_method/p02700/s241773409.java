import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int cb = (c + b - 1) / b;
		int ad = (a + d - 1) / d;
		if (cb <= ad) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
