import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double C = input.nextDouble();
		
		double Csin = Math.sin(Math.toRadians(C));
		double Ccos = Math.cos(Math.toRadians(C));
		
		double S = 0.5 * a * b * Csin;
		double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Ccos);
		double h = b * Csin;
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}