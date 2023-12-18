import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x= sc.nextDouble();
	double pi=Math.PI;
	double a=2*pi*x;
	double b=pi*x*x;
	System.out.printf("%f %f\n",a,b);
	sc.close();
}
}
