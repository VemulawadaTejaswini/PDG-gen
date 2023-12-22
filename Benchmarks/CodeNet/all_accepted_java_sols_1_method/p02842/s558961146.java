import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			String ans = "";
			int test = (int)(n / 1.08d);
			if((int)(test * 1.08) == n) {
				ans = String.valueOf(test);
			} else if((int)((test + 1) * 1.08) == n) {
				ans = String.valueOf(test + 1);
			} else {
				ans = ":(";
			}
			System.out.println(ans);

		}

	}

}
