import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println(1.0D/(+0.0D));

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

			if ((x2-x1)==0 || (x4-x3)==0) {
				if ((x2-x1)==0 && (x4-x3)==0) System.out.println("YES");
				else System.out.println("NO");
			} else {
				double s_ab = (y2-y1)/(x2-x1);
				double s_cd = (y4-y3)/(x4-x3);
				if (s_ab == s_cd) System.out.println("YES");
				else System.out.println("NO");
			}
		}

	}
}