import java.util.Scanner;
import java.lang.Math;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	double r = scan.nextDouble();

	double area = r * r * Math.PI;
	double circumference = 2 * r * Math.PI;

	System.out.printf("%f %f\n", area, circumference);

    }

}