import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (true) {
			if (x < y) {
				int tmp1 = x;
				x = y;
				y = tmp1;
			}
			int tmp2 = y;
			y = x % y;
			x = tmp2;
			if (y == 0)
				break;
		}
		System.out.println(x);

	}

}
