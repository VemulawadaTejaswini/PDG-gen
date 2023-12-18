import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	double r = sc.nextDouble();
	double area = (pi*r*r);
	double length = (2*r*pi);
	System.out.printf("%f %f",area,length);
	}
}