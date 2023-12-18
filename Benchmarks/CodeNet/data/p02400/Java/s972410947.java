import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		double r=sc.nextDouble();

		double c1=r*r*3.141592653589;
		double c2=2*r*3.141592653589;

		System.out.printf("%f %f",c1,c2);
	}
}