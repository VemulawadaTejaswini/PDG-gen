import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		prob(System.in, System.out);
	}

	public static void prob(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);
		int hourLength = sc.nextInt();
		int minLength = sc.nextInt();

		int hour = sc.nextInt();
		int min = sc.nextInt();

		int hourTheta = hour * 30;
		int minTheta = min * 6;

		double hourX = hourLength * Math.cos(Math.toRadians(hourTheta - 90));
		double hourY = hourLength * Math.sin(Math.toRadians(hourTheta + 90));

		double minX = minLength * Math.cos(Math.toRadians(minTheta - 90));
		double minY = minLength * Math.sin(Math.toRadians(minTheta + 90));

		double diffX = hourX - minX;
		double diffY = hourY - minY;

		double diff = Math.sqrt(diffX * diffX + diffY * diffY);

		System.out.println(diff);
	}
}