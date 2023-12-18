import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double C = sc.nextDouble();
			double sin = Math.sin(Math.toRadians(C));
			double cos = Math.cos(Math.toRadians(C));
				double S = (a*b*sin)/2;
				double L = a+b+Math.sqrt(a*a + b*b -2*a*b * cos);
				double h = 2*S/a;
			System.out.println(S + "\r\n" + L + "\r\n" + h);
	}
}