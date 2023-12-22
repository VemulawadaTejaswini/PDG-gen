import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int max = 0;

		if (k <= a) {
			max = k;
		} else if (k <= (a + b)) {
			max = a;
		} else {
//			max = a - (k - a - b);
			k = k - a;
			k = k - b;
			max = a - k;
		}

//		if (0 < max) {
			System.out.print(max);
//		} else {
//			System.out.print(0);
//		}

	}
}