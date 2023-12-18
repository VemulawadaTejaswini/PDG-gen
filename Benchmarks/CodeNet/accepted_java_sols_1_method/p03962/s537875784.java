import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 3;

		if (a == b) {
			result--;
		}
		if (a == c) {
			result--;
		}
		if (b == c) {
			result--;
		}

		if (result == 0) {
			result = 1;
		}

		System.out.println(result);
	}

}
