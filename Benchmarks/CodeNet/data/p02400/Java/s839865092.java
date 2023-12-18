import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		double r = scan.nextInt();
		double pi = Math.PI;

		System.out.printf("%.6f %.6f",r*r*pi, 2*r*pi);
	}
} 