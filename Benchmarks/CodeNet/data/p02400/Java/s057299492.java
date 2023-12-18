import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int r=sc.nextInt();

		double c1=1.0*r*r*3.141592653589;
		double c2=1.0*2*r*3.141592653589;

		System.out.printf("%f %f",c1,c2);
	}
}