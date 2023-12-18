import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1= sc.nextDouble(),y1= sc.nextDouble(),x2=sc.nextDouble(),y2=sc.nextDouble();
		double xd= Math.abs((x1-x2));
		double xd2 = Math.pow(xd, 2);
		double yd = Math.abs((y1-y2));
		double yd2 = Math.pow(yd, 2);
		double distance = Math.sqrt(xd2+yd2);
		System.out.printf("%9f",distance);
		System.out.println();
	}
}
