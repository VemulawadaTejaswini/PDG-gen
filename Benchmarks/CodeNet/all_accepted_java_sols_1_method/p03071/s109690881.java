import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a == b) {
			System.out.println(a + b);
		} else if (a > b) {
			System.out.println(a + a - 1);
		} else {
			System.out.println(b + b - 1);
		}
	}
}
