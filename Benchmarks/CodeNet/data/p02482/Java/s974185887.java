import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	double r = scan.nextDouble();
	double pi = Math.PI;
	
	double area = r * r * pi;
	double round = 2.0 * pi * r;

	System.out.printf("%.6f %.6f\n",area,round);
    }
}