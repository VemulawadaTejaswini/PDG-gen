import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int ans = 0;

		Scanner scan = new Scanner(System.in);

		int H = Integer.parseInt(scan.next());
		int W = Integer.parseInt(scan.next());
		int h = Integer.parseInt(scan.next());
		int w = Integer.parseInt(scan.next());

		ans = H * W;

		ans = ans - (h * W);

		ans = ans - (H * w);

		ans = ans + (h * w);

		System.out.println(ans);
	}
}