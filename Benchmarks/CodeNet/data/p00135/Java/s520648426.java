import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String[] time = sc.nextLine().split(":");
			handAngle(time);
		}


	}

	private static void handAngle(String[] time) {
		int h = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);

		double lh = m * 360 / 60;
		double sh = ( h * 60 + m )* 360 / ( 60 * 12 );

		double angle = Math.abs(lh - sh);

			if (0 <= angle && angle < 30) {
				System.out.println("alert");
			} else if (90 <= angle && angle <= 180) {
				System.out.println("safe");
			} else {
				System.out.println("warning");
			}
	}

}
