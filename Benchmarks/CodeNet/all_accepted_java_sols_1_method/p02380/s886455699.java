import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int C = scan.nextInt();

		double theta = C >= 90 ? Math.toRadians(180 - C) : Math.toRadians(C);
		
		double h = Math.sin(theta) * b;

		double w = C >= 90 ? a + b * Math.cos(theta) : a - b * Math.cos(theta);
		double c = Math.sqrt(h * h + w * w);
		double L = a + b + c;
		double S = h * a / 2.0;

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
		
		scan.close();
	}

}