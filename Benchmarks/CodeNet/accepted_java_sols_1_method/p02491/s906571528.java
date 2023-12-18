import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a, b;
		double f;
		
		a = scn.nextInt();
		b = scn.nextInt();
		f = 1.0 * a / b;
		
		System.out.printf("%d %d %f", a / b, a % b, f);
		
		scn.close();
	}
}