import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int n = b - a;
		int m = c - b;

		if (n == m) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}