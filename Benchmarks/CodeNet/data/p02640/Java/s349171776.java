import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt();
		int y = (4 * X - Y) / 2;
		if (y < 0 || Y % 2 != 0)
			System.out.println("NO");
		else {
			int x = X - y;
			if (4 * x + 2 * y == Y)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
