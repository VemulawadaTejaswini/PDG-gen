import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = 0;
		for (int i = 0; i < 2; i++) {
			if (a == b || a > b) {
				result += a;
				a--;
			} else if (a < b) {
				result += b;
				b--;
			}
		}
		System.out.println(result);
	}
}