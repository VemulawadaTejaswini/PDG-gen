import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		int ans = (0 <= x && x < y) || (x < y && y <= 0) ? y - x
				: (0 < y && y < x) || (y < x && x < 0) ? x - y + 2
				: Math.abs(Math.abs(x) - Math.abs(y)) + 1;
		System.out.println(ans);
	}
}
