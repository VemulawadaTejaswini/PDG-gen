
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static boolean isMT (int a, int b) {
		return b > a;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (isMT(a, b)) {
			if (isMT(b, c)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}