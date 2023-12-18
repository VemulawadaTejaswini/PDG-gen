import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		double l = m * 6;
		double s = (h * 60 + m) * 0.5;
		double kakudo = s - l;
		double result = Math.cos(Math.toRadians(kakudo));
		double rsq = (a * a) + (b * b) - (2 * a * b * result);
		System.out.println(Math.sqrt(rsq));


	}
}
