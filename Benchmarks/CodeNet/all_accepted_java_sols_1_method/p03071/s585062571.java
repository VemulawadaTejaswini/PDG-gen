import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int aa = a + a - 1;
		int ab = a + b;
		int bb = b + b - 1;

		int sum = Math.max(aa, ab);

		System.out.println(Math.max(sum, bb));

		sc.close();

	}
}