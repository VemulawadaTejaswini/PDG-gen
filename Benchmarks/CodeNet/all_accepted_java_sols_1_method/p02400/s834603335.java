import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		double a=n.nextDouble();
		double b=a*a*Math.PI;
		double c=a*2*Math.PI;
		System.out.printf("%.6f %.6f",b,c);
	}
}