import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int a = src.nextInt();
		int b = src.nextInt();
		int h = src.nextInt();
		int m = src.nextInt();
		double radmH = (360.0/12.0)/60.0; // rad / min
		double radmM = (360/60);

		double c = (30.0 / 60.0)*m;
		double hx = a * Math.cos(Math.toRadians(radmH*h*60 + c));// hにおける1分あたりの角速度
		double hy = a * Math.sin(Math.toRadians(radmH*h*60 + c));
		double mx = b * Math.cos(Math.toRadians(radmM*m));		// mにおける1分あたりの角速度
		double my = b * Math.sin(Math.toRadians(radmM*m));
		double dist = Math.sqrt(Math.pow((hx - mx), 2.0) + Math.pow(hy - my, 2.0));
		System.out.println(dist);
	}
}