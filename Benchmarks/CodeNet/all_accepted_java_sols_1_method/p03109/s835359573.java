import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int y = Integer.parseInt(s.substring(0, 4));
		int m = Integer.parseInt(s.substring(5, 7));
		int d = Integer.parseInt(s.substring(8));

		String ans = "TBD";

		if (y <= 2019) {
			if (m <= 4) {
				if (d <= 30) {
					ans = "Heisei";
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
