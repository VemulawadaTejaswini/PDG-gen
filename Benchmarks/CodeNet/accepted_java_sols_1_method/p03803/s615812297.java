import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 1) {
			a = 14;
		}
		if (b == 1) {
			b = 14;
		}

		String ans;

		if (a > b) {
			ans = "Alice";
		} else if (b > a) {
			ans = "Bob";
		} else {
			ans = "Draw";
		}

		System.out.println(ans);

		sc.close();
	}

}
