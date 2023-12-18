import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (y % 2 == 1) {
			System.out.println("No");
			return;
		}
		// 2x <= y <= 4x
		if (y >= 2 * x && y <= 4 * x) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}






