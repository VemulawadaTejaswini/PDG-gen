import java.util.Scanner;

public class Main {
	static double A;
	static double B;
	static double C;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=A*B;
		C=Math.round(C);
		System.out.println(C);
		}
	}