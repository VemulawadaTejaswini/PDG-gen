import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		Integer[] a = { 1, 3, 5, 7, 8, 10, 12 };
		int m = 0, n = 0;

		if (Arrays.asList(a).contains(x)) {
			m = 1;
		}
		if (Arrays.asList(a).contains(y)) {
			n = 1;
		}

		if ((m + n) % 2 == 0 && x != 2 && y != 2) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
