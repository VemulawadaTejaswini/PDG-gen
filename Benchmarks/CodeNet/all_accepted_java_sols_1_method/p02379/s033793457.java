import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x = (double) Math.pow(Math.abs(x2-x1), 2);
		double y = (double) Math.pow(Math.abs(y2-y1), 2);
		double dis =  Math.sqrt(x + y);
		System.out.print(dis);
	}
}

