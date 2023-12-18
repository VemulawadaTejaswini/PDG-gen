import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();


		if (b <= c || d <= a) {
			System.out.println(0);
		} else if (a >= c) {
			if (b <= d) {
				System.out.println(b - a);
			} else {
				System.out.println(d - a);
			}
		} else {
			if (b <= d) {
				System.out.println(b - c);
			} else {
				System.out.println(d - c);
			}
		}

		sc.close();
	}
}