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

			double[] AB = {x2-x1, y2-y1}, CD = {x4-x3, y4-y3};
			double cross = AB[0]*CD[1]-AB[1]*CD[0];

			if (cross < 1e-6) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}