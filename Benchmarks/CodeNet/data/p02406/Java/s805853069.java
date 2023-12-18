import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			print3(x, i);
		}
		System.out.println();
	}

	public static void print3(int x, int i) {
		if (x % 10 == 3) {
			System.out.print(" " + i);
		} else if (x / 10 > 0) {
			print3(x / 10, i);
		}
	}
}