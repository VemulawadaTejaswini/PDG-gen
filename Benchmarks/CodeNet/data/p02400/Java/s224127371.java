import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x= sc.nextDouble();
	double a=2*Math.PI*x;
	double b=Math.PI*x*x;
	System.out.printf("%f %f\n",a,b);
}
}

