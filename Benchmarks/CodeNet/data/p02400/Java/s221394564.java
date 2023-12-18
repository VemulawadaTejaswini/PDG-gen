import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double x = Math.PI;
		System.out.printf("%.5f",r*r*x);
		System.out.print(" ");
		System.out.printf("%.5f",2*r*x);
	}
}