import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] a = new String[h];

		for (int i = 0; i < h; i++) {
			a[i] = sc.next();
		}

		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}
		System.out.print("\n");

		for (int i = 0; i < h; i++) {
			System.out.println("#" + a[i] + "#");
		}

		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}

	}
}