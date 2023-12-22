import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int n = sc.nextInt();

		int n10, n100, n1000;

		for (int i = 1; i <= n; i++) {

			n10 = i / 10;//10の位が3かどうか
			n100 = i / 100;//100の位が3かどうか
			n1000 = i / 1000;//1000の位が3かどうか

			if (i % 3 == 0 || i % 10 == 3 || n10 % 10 == 3 || n100 % 10 == 3 || n1000 % 10 == 3) {
				System.out.print(" " + i);

			}

		}
		System.out.println();
	}
}

