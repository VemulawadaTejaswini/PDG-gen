import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 計算式は 距離= sqrt( (x1-x2)^2 + (y1-y2)^2 )
		 */

		double distance = DistanceCalculation(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		System.out.println(distance);

	}

	static double DistanceCalculation(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return distance;
	}

}

