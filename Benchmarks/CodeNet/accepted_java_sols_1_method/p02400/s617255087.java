import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	double p = scan.nextDouble();
double x = Math.PI * 2 * p;
double z = Math.PI * (p *p);
	System.out.printf("%f %f", z, x);
}
}

