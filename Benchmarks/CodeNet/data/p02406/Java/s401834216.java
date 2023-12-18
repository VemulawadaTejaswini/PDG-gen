
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (check(i)) {
				System.out.print(" ");
				System.out.print(i);
			}
		}
	}

	private static boolean check(int i) {
		if (i % 3 == 0) {
			return true;
		}
		int len = (int) Math.log10(i) + 1;
		int tmp = i;
		int result = 0;
		for (int j = len - 1; j >= 0; j--) {
			int warikitta = tmp / (int) Math.pow(10, j);
			result = tmp - warikitta * (int) Math.pow(10, j);
			if (result == 3) {
				return true;
			}
			tmp = tmp - result;
		}
		return false;
	}
}