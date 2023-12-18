import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		double x = Math.PI;
		double r = (double) input;
		System.out.printf("%.5f",r*r*x);
		System.out.print(" ");
		System.out.printf("%.5f",2*r*x);
	}
}