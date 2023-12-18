import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		while (N-- > 0) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();

			double s_ab = (x2-x1)/(y2-y1);
			double s_cd = (x4-x3)/(y4-y3);

			if (s_ab == s_cd) System.out.println("YES");
			else System.out.println("NO");

		}

	}
}