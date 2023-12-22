import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		if (0 <= x - r && x + r <= w && 0 <= y - r && y + r <= h)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}