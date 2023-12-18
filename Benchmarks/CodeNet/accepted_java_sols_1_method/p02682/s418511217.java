import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int score = 0;
		if (k < a) {
			score = k;
		} else {
			score = a;
			k -= a;
			if (k > b) { // k <= b, do nothing, too.
				k -= b;
				score -= k;
			}
		}
		System.out.println(score);
	}

}