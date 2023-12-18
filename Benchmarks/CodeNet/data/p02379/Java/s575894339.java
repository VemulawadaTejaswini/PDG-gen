import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ans;
		int x1, y1, x2, y2;
		x1 = Integer.parseInt(sc.next());
		y1 = Integer.parseInt(sc.next());
		x2 = Integer.parseInt(sc.next());
		y2 = Integer.parseInt(sc.next()); sc.close();
		ans = ((y2 - y1) / (y2 - y1)) + ((x2 - x1) / (x2 - x1));
		System.out.println(Math.sqrt(ans));
	}
}