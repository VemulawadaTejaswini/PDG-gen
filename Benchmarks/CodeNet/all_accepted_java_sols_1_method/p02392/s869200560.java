import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String verdict = null;

		if (a < b && b < c) {
			verdict = "Yes";
		} else {
			verdict = "No";
		}
		System.out.println(verdict);
	}

}
