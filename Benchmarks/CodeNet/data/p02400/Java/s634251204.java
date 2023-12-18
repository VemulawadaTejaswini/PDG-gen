import java.util.Scanner;
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double x,y;
		double pi= Math.PI;
		x=2*r*pi;
		y=r*r*pi;
		System.out.printf("%.6f %.6f", x, y);
	}
}