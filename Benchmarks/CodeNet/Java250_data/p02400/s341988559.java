import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r =  sc.nextDouble();
		double pi = Math.PI;
		double area = Math.pow(r, 2) * pi; // ??¢???
		double Cir =2 * pi * r; //Circumference ?????¨
		System.out.printf("%.5f %.5f\n",area,Cir);
	}
}