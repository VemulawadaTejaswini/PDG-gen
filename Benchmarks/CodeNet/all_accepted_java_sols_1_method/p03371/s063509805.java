
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int max = Math.max(X, Y);
		int min = Math.min(X, Y);
		int total = 0;
		int remain = 0;

		if (max == X) { //Aピザの残りを買う必要がある
			remain = A;
		} else {
			remain = B;
		}

		if (A >= 2 * C && B >= 2 * C) {//Its cheaper to buy AB pizza
			total = total + max * 2 * C;
		} else if (A >= 2 * C && A + B >= 2 * C && remain == A) {
			total = total + max * 2 * C;
		} else if (B >= 2 * C && A + B >= 2 * C && remain == B) {
			total = total + max * 2 * C;
		} else if (A + B >= 2 * C) {
			total = total + min * 2 * C + remain * (max - min);
		} else {
			total = A * X + B * Y;
		}
		System.out.println(total);
		scan.close();
	}
}
