import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double x =Math.PI;
		double l = 2 * r * x;
		double c = r * r * x;
		System.out.println(l+" "+c);
		
	}

}