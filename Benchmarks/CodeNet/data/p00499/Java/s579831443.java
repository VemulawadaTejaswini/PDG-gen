import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int l = sc.nextInt();
	static int a = sc.nextInt();
	static int b = sc.nextInt();
	static int c = sc.nextInt();
	static int d = sc.nextInt();


	public static void main(String[] args) {
		int j = 0;
		int m = 0;
			if (a % c == 0) {
				j = a / c;
			} else {
				j = a / c + 1;
			}

			if (b % d == 0) {
				m = b / d;
			} else {
				m = b / d + 1;
			}

		System.out.println(l - Math.max(j, m));

	}

}
