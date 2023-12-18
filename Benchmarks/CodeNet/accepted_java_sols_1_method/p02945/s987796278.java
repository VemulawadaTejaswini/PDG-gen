import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum = A+B;
		int difference = A-B;
		int product = A*B;

		if (sum>=difference&&sum>=product) {
			System.out.println(sum);
		} else if (difference>=sum&&difference>=product) {
			System.out.println(difference);
		} else {
			System.out.println(product);
		}

		sc.close();
	}
}