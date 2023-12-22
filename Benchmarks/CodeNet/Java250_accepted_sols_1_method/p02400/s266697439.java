import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double r = sc.nextDouble();
		 double pi = 3.141592653589;
		 String area = String.format("%.6f", 1.0*r*r*pi);
		 String circle = String.format("%.6f", r*2*pi);
		 System.out.println(area + " " + circle);
	}

}