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
		int a = y / 4;
		int b = y / 2;
		// a <= x <= b
		if (x >= a && x <= b) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}






