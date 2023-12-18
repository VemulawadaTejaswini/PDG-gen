import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			double h = h2 * 30 + m2 / 2;
			double m = m2 * 6;
			double kaku;
			if(h> m) {
				kaku = h - m;
			}else {
				kaku = m - h;
			}
			if(kaku > 180) {
				kaku -= 180;
			}
			double cos = Math.cos(Math.toRadians(kaku));
			double hen = a * a + b * b - 2 * a * b * cos;
			double hen2 = Math.sqrt(hen);
			System.out.println(hen2);
		}
}
