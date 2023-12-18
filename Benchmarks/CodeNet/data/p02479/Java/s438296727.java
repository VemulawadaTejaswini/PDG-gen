import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		System.out.printf("%.6f %.6f",Math.PI*r*r,2*Math.PI*r);
		System.out.println("");
		scan.close();
	}
}