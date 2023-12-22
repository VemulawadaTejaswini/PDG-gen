import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W, H, x, y;
		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();

		double ans = (double)W*H/ 2;
		int num = (W == x * 2 && H == y * 2 ) ? 1 : 0;
        System.out.println(String.format("%.10f", ans) + " " + num);
	}
}