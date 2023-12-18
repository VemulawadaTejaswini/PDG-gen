import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();

			double x,y;

			/*クラメルの公式*/

			x = ((c*e)-(b*f))/((a*e)-(b*d));
			y = ((a*f)-(c*d))/((a*e)-(d*b));

			System.out.println(x+ " " +y);
		}
	}
}