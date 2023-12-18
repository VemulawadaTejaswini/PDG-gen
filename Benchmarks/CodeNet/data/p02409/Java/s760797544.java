import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		Integer[] build = new Integer[120];

		for (Integer i = 0; i < 120; i++) {
			build[i] = 0;
		}

		for (Integer i = 0; i < n; i++) {
			Integer b = (sc.nextInt() - 1) * 30;
			Integer f = (sc.nextInt() - 1) * 10;
			Integer r = sc.nextInt();
			Integer v = sc.nextInt();

			build[b + f + r - 1] += v;
		}

		for (Integer i = 0; i < 120; i++) {
			System.out.print(" " + build[i]);
			if(i == 119) {
				System.out.println();
				return;
			}
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
			if ((i + 1) % 30 == 0) {
				System.out.println("####################");
				continue;
			}
		}

		
	}
}
