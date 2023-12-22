import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		System.out.print(String.format("%.6f", r*r*Math.PI));
		System.out.print(" ");
		System.out.print(String.format("%.6f", 2*r*Math.PI)); 
	}
}

