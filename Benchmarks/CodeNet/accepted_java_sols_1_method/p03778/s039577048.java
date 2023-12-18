import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if ((a <= b && b<= a+w) || (a<=b+w && b+w <= a+w)) {
			System.out.println(0);
			return;
		}
		if (a+w < b) {
			System.out.println(b-(a+w));
			return;
		}
		if (b+w < a) {
			System.out.println(a-(b+w));
			return;
		}
		System.out.println(0);
	}
}
