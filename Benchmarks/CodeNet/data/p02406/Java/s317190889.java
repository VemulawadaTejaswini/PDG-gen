import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		for (int x = 1; x <= i; x++) {
			if ((x % 3 == 0 || String.valueOf(x).indexOf("3") != -1)) {
				System.out.print(" " + x);
			}
		}
		System.out.println("\n");
		sc.close();

	}

}