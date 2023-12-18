import java.util.Scanner;

public class Main {
	static double A;
	static double B;
	static double C;
	static int D;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=A*B;
		C=Math.floor(C);
		D=(int)C;
		System.out.println(D);
	}
}

