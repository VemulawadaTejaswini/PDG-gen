import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean inclued3 = false;

		for (int i = 1, a; i <= n; i++) {
			a = 1;
			while (i / a >= 1) {
				if (i % (a * 10) / a == 3) {
					inclued3 = true;
					break;
				} else {
					inclued3 = false;
				}
				a *= 10;
			}

			if (i % 3 == 0 || inclued3) {
				System.out.print(" " + i);
			}

		}
		System.out.println();
	}

}