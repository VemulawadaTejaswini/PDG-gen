import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int k = 3; k <= n; k++) {
			String s = String.valueOf(k);
			if (k % 3 == 0 || s.indexOf("3") >= 0) {
				System.out.printf(" " + k);
			}

		}
		System.out.printf("\n");
	}
}