import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int a = h1 * 60 + m1;
		int b = h2 * 60 + m2;
		System.out.println(Math.max(b - a - k, 0));
	}
}
