import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	int c = scan.nextInt();
	double h = b * Math.sin(Math.toRadians(c));
	double x = Math.sqrt(h * h +
			     (a - b * Math.cos(Math.toRadians(c)))*(a - b * Math.cos(Math.toRadians(c))));
	double S = a * h / 2;
	System.out.println(S);
	System.out.println(a+b+x);
	System.out.println(h);
    }
}