import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
		
		double hour = h / 12  + m / 60 * (360 / 12) / 360;
		double minutes = m / 60;
		
		double angle = 360;
		if(hour == 0) {
			angle *= 1 - minutes;
		}else if(minutes == 0) {
			angle *= 1 - hour;
		}else {
			angle *= hour < minutes ? minutes - hour : hour - minutes;
		}
		double ansSquare = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(angle));
		
		System.out.println(Math.sqrt(ansSquare));
		sc.close();
	}

}