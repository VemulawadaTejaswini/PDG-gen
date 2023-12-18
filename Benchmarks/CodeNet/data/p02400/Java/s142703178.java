import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();		
		double x = Math.PI;
		double l = 2 * r * x;
		double c = r * r * x;
		System.out.println(c+" "+l);
	}
}