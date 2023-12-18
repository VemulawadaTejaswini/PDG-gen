import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double PI = 3.14159265;
		System.out.printf("%.5f %.5f\n",r*r*PI,2.0*r*PI);
	}
}