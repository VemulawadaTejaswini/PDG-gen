import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String str[] = new String[a];
		for (int i = 0; i < b + 2; i++) {
			System.out.print("#");
		}

		System.out.println();

		for (int i = 0; i < a; i++) {
			str[i] = sc.next();
			System.out.println("#" + str[i] + "#");
		}

		for (int i = 0; i < b + 2; i++) {
			System.out.print("#");
		}

		System.out.println();

	}
}
